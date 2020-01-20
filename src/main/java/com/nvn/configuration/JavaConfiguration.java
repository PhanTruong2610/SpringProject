package com.nvn.configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.nvn.entities.Account;
import com.nvn.entities.Category;
import com.nvn.entities.Lesson;
import com.nvn.entities.Subject;

@Configuration
@EnableWebMvc
@PropertySources({
	@PropertySource("classpath:jdbc.properties"),
	@PropertySource("classpath:hibernate.properties")
})
@ComponentScan(basePackages = "com.nvn")
public class JavaConfiguration implements WebMvcConfigurer{
	
	@Autowired
	private Environment env;
	
	@Value("${jdbc.driverClassName}")
	private String driverClassName;
	
	@Value("${jdbc.url}")
	private String url;
	
	@Value("${jdbc.username}")
	private String username;
	
	@Value("${jdbc.password}")
	private String password;
	
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/views/jsp/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource= new DriverManagerDataSource();
		dataSource.setDriverClassName(driverClassName);
		dataSource.setUrl(url);
		dataSource.setUsername(username);
		dataSource.setPassword(password);
		return dataSource;
	}

	@Bean
	public JdbcTemplate jdbcTemplate() {
		return new JdbcTemplate(dataSource());
	}
	
	@Bean
	public BasicDataSource hibernateDataSource() {
		BasicDataSource hibernateDataSource= new BasicDataSource();
		hibernateDataSource.setDriverClassName(driverClassName);
		hibernateDataSource.setUrl(url);
		hibernateDataSource.setUsername(username);
		hibernateDataSource.setPassword(password);
		return hibernateDataSource;
	}
	
	@Bean
	public LocalSessionFactoryBean localSessionFactoryBean() {
		LocalSessionFactoryBean localSessionFactoryBean= new LocalSessionFactoryBean();
		localSessionFactoryBean.setPackagesToScan("com.nvn.entities");
		localSessionFactoryBean.setDataSource(hibernateDataSource());
		Properties prop = new Properties();
		prop.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		prop.put("hibernate.show_sql", "true");
		prop.put("hibernate.hibernate.current_session_context_class", "thread");
		localSessionFactoryBean.setHibernateProperties(prop);
		localSessionFactoryBean.setAnnotatedClasses(Account.class, Category.class, Lesson.class, Subject.class);
		return localSessionFactoryBean;
	}
	
	@Bean
	  public HibernateTransactionManager getTransactionManager() {
	    HibernateTransactionManager transactionManager = new HibernateTransactionManager();
	    transactionManager.setSessionFactory(localSessionFactoryBean().getObject());
	    return transactionManager;
	  }
	
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

	public void addResourceHandlers(final ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}
}
