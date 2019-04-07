package com.san.springws_test.restService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.san.springws_test.model.Employee;
import com.san.springws_test.model.EmployeeResponse;

@RestController
@RequestMapping("/employee")
public class EmployeeDetailControler {

	
	/**
	 * rest get method to accept json request and return json response
	 * @param userRequest = {"name":"santosh", deptId:"deptId"};
	 * @return userResponse
	 */
	@RequestMapping(value="/getEmp")
	 public List<Employee> getEmployees(Model model){
		EmployeeResponse response = new EmployeeResponse();
		model.addAttribute("employees", this.getAllEmployees());
		return this.getAllEmployees();
	 }
	
	public List<Employee> getAllEmployees(){
		List<Employee> empList = new ArrayList<>();
		
		Employee emp = new Employee();
		emp.setName( "santosh");
		emp.setDept(10);
		emp.setSalary(90000.00);
		
		empList.add(emp);
		
		emp = new Employee();
		emp.setName( "tejas");
		emp.setDept(11);
		emp.setSalary(70000.00);
		
		empList.add(emp);
		return empList;
	}
}
