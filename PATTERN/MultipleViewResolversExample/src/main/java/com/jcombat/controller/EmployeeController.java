package com.jcombat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jcombat.bean.Employee;

@Controller
@RequestMapping(value = "/Employee")
public class EmployeeController {
	
	/*
	 * http://localhost:8082/MultipleViewResolversExample/API/Employee/Ramesh/1234
	 */
	@RequestMapping(value = "/{name}/{empId}", method = RequestMethod.GET)
	public ModelAndView process(
			@PathVariable("name") String name,
			@PathVariable("empId") String empId) {
		ModelAndView modelAndView = new ModelAndView();
		Employee employee = new Employee();
		employee.setEmpId(empId);
		employee.setName(name);
		modelAndView.setViewName("jsonView");
//		modelAndView.setViewName("employeeDetails");
		modelAndView.addObject("employee", employee);
		return modelAndView;
	}
}