/**
 * 
 * This class is called Employees. This class is the blueprint for forming the employee objects needed
 * for the user to be able to properly schedule. It uses getters and setters to maintain consistency and
 * security so the variables remain private.
 * 
 */

package com.FinalProject.EmployeeSchedulingTool.Model;

import javax.persistence.*;

//create the table in the schema in the database
@Entity
@Table(name = "Employee_Schedule", schema = "schedule_tool_db")
public class Employees {
	
	//list of employee variables to store the data the user inputs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long employeeId;
	
	//use the column annotation to name the variables in the table in the database
	@Column(name = "first_name")
	private String employeeFirstName;
	
	@Column(name = "middle_initial")
	private String employeeMiddleInitial;
	
	@Column (name = "last_name")
	private String employeeLastName;
	
	@Column(name = "employee_hours_monday")
	private String employeeHoursMonday;
	
	@Column(name = "employee_hours_tuesday")
	private String employeeHoursTuesday;
	
	@Column(name = "employee_hours_wednesday")
	private String employeeHoursWednesday;
	
	@Column(name = "employee_hours_thursday")
	private String employeeHoursThursday;
	
	@Column(name = "employee_hours_friday")
	private String employeeHoursFriday;
	
	@Column(name = "employee_hours_saturday")
	private String employeeHoursSaturday;
	
	@Column(name = "employee_hours_sunday")
	private String employeeHoursSunday;
	
	//getters and setters for the private data types above
	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeFirstName() {
		return employeeFirstName;
	}

	public void setEmployeeFirstName(String employeeFirstName) {
		this.employeeFirstName = employeeFirstName;
	}

	public String getEmployeeMiddleInitial() {
		return employeeMiddleInitial;
	}

	public void setEmployeeMiddleInitial(String employeeMiddleInitial) {
		this.employeeMiddleInitial = employeeMiddleInitial;
	}

	public String getEmployeeLastName() {
		return employeeLastName;
	}

	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}

	public String getEmployeeHoursMonday() {
		return employeeHoursMonday;
	}

	public void setEmployeeHoursMonday(String employeeHoursMonday) {
		this.employeeHoursMonday = "Monday: " + employeeHoursMonday;
	}
	
	public String getEmployeeHoursTuesday() {
		return employeeHoursTuesday;
	}

	public void setEmployeeHoursTuesday(String employeeHoursTuesday) {
		this.employeeHoursTuesday = "Tuesday: " + employeeHoursTuesday;
	}
	
	public String getEmployeeHoursWednesday() {
		return employeeHoursWednesday;
	}

	public void setEmployeeHoursWednesday(String employeeHoursWednesday) {
		this.employeeHoursWednesday = "Wednesday: " + employeeHoursWednesday;
	}
	
	public String getEmployeeHoursThursday() {
		return employeeHoursThursday;
	}

	public void setEmployeeHoursThursday(String employeeHoursThursday) {
		this.employeeHoursThursday = "Thursday: " + employeeHoursThursday;
	}
	
	public String getEmployeeHoursFriday() {
		return employeeHoursFriday;
	}

	public void setEmployeeHoursFriday(String employeeHoursFriday) {
		this.employeeHoursFriday = "Friday: " + employeeHoursFriday;
	}
	
	public String getEmployeeHoursSaturday() {
		return employeeHoursSaturday;
	}

	public void setEmployeeHoursSaturday(String employeeHoursSaturday) {
		this.employeeHoursSaturday = "Saturday: " + employeeHoursSaturday;
	}
	
	public String getEmployeeHoursSunday() {
		return employeeHoursSunday;
	}

	public void setEmployeeHoursSunday(String employeeHoursSunday) {
		this.employeeHoursSunday = "Sunday: " + employeeHoursSunday;
	}
	
}
