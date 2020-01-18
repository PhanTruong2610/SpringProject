package com.nvn.model;
// Generated Jan 18, 2020 4:07:11 PM by Hibernate Tools 3.5.0.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Role generated by hbm2java
 */
@Entity
@Table(name = "role", catalog = "learning")
public class Role implements java.io.Serializable {

	private Integer roleId;
	private String roleName;
	private Account account;

	public Role() {
	}

	public Role(String roleName) {
		this.roleName = roleName;
	}

	public Role(String roleName, Account account) {
		this.roleName = roleName;
		this.account = account;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "RoleId", unique = true, nullable = false)
	public Integer getRoleId() {
		return this.roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	@Column(name = "RoleName", nullable = false, length = 45)
	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "role")
	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

}
