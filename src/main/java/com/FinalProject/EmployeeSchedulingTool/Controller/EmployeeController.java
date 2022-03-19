/**
 * 
 * This class is called EmployeeController. It maps the user to the correct location for whichever buttons
 * the user pushes. It will take the user to the desired HTML page by using the mapping classes.
 * 
 */

package com.FinalProject.EmployeeSchedulingTool.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.FinalProject.EmployeeSchedulingTool.Model.Employees;
import com.FinalProject.EmployeeSchedulingTool.Service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	@GetMapping("/")
	public String homePage(Model employeeSchedule) {
		
		employeeSchedule.addAttribute("listAllEmployees" , employeeService.getEmployees());
		//return the name of the html file to map to
		return "titlePage";
		
	}
	
	@GetMapping("/addNewEmployee")
	public String addNewEmployee(Model employeeData) {
		
		//create an employee object  and add the attributes the user enters for each variable into the model created to store the data
		Employees freshEmployee = new Employees();
		employeeData.addAttribute("freshEmployee", freshEmployee);
		return "addEmployees";
		
	}
	
	@PostMapping("/saveNewEmployee")
	public String saveNewEmployee(@ModelAttribute("freshEmployee") Employees freshEmployee) {
		
		//save the new employee in the repo created from the EmployeeService class
		employeeService.saveNewEmployee(freshEmployee);
		return "redirect:/";
		
	}
	
	@GetMapping("/UpdateEmployee/{employeeId}")
	public String UpdateEmployee(@PathVariable(value = "employeeId") long employeeId, Model userFindEmployee) {
		
		//grab the employee using the pullEmployeeUsingID method created in another class
		Employees enteredEmployee = employeeService.pullEmployeeUsingId(employeeId);
		//add attributes entered by the user to the model created
		userFindEmployee.addAttribute("enteredEmployee", enteredEmployee);
		return "updateEmployees";
		
	}
	
	@GetMapping("/DeleteEmployee/{employeeId}")
	public String DeleteEmployee(@PathVariable(value = "employeeId") long employeeId) {
		
		//delete employee using the method created in another class
		this.employeeService.deleteEmployeeUsingId(employeeId);
		return "redirect:/";
		
	}
	
	@GetMapping("/ViewHours/{employeeId}")
	public String ViewHours(@PathVariable(value = "employeeId") long employeeId, Model userFindEmployeeHours) {
		
		//pull employee with the same method used above, then add the employees' attributes to the model created
		Employees enteredEmployeeHours = employeeService.pullEmployeeUsingId(employeeId);
		userFindEmployeeHours.addAttribute("enteredEmployeeHours", enteredEmployeeHours);
		//map to the html only showing the employee's name and hours instead of all the other attributes
		return "employeeHours";
		
	}
	
}
