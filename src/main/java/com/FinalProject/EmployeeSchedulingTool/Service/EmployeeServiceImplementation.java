/**
 * 
 * This class is called EmployeeServiceImplementation. It implements the EmployeeService interface creating a
 * repository for the user to save and edit employees from. It returns lists of employees entered by
 * the user and pulls the employees by ID number when the user needs to edit or delete them.
 * 
 */

package com.FinalProject.EmployeeSchedulingTool.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FinalProject.EmployeeSchedulingTool.Model.Employees;
import com.FinalProject.EmployeeSchedulingTool.Repository.EmployeeRepository;

@Service
public class EmployeeServiceImplementation implements EmployeeService {

	//create repo to store employees by implementing the interface with JpaRepository
	@Autowired
	private EmployeeRepository employeeRepo;
	
	@Override
	public List<Employees> getEmployees() {
		
		//return the list of all employees
		return employeeRepo.findAll();
		
	}
	
	@Override
	public void saveNewEmployee(Employees freshEmployee) {
		
		//method used to save the new employee object created into the repository
		this.employeeRepo.save(freshEmployee);
		
	}

	@Override
	public Employees pullEmployeeUsingId(long employeeId) {
		
		//using the Optional class to pull the employee via the ID assigned to the object selected by the user
		Optional<Employees> getEmployee = employeeRepo.findById(employeeId);
		Employees findEmployee = new Employees();
		//if the employee is present, assign the object created as that employee, else throw an error to the user
		if(getEmployee.isPresent()) {
			findEmployee = getEmployee.get();
		}
		else {
			throw new RuntimeException("Employee ID " + employeeId + " not found. Try again!");
		}
		//return the Employees object created
		return findEmployee;
		
	}

	@Override
	public void deleteEmployeeUsingId(long employeeId) {
		
		//method to delete the employee via whatever ID number was selected by the user
		this.employeeRepo.deleteById(employeeId);
		
	}
	
}
