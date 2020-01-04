package com.nvn.controller;

import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.nvn.entities.Employee;

@Controller
public class EmployeeController {
  @RequestMapping(value = { "/employee"}, method = RequestMethod.GET)
  public String addEmployee(Model model) {
    model.addAttribute("employee", new Employee());
    return "add-employee";
  }
  @RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
  public String doAddEmployee(@ModelAttribute("employee") Employee employee, ModelMap modelMap) {
    employee.setName(employee.getName().toUpperCase());
    modelMap.addAttribute("employee", employee);
    return "view-employee";
  }
}