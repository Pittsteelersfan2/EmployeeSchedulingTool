/**
 * 
 * This interface is called EmployeeService. It creates methods that are later implemented by the program to
 * save/delete employees and pull employees from the repository using their ID. This interface makes sure that
 * consistency is maintained across the classes.
 * 
 */

package com.FinalProject.EmployeeSchedulingTool.Service;

import java.util.List;

import com.FinalProject.EmployeeSchedulingTool.Model.Employees;

public interface EmployeeService {
	
	//created methods to be implemented in the class that extends this interface
	List<Employees> getEmployees();
	void saveNewEmployee(Employees freshEmployee);
	Employees pullEmployeeUsingId(long employeeId);
	void deleteEmployeeUsingId(long employeeId);
	
}
