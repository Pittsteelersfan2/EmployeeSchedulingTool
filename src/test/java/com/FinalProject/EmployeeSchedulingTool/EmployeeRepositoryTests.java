package com.FinalProject.EmployeeSchedulingTool;

import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import com.FinalProject.EmployeeSchedulingTool.Model.Employees;
import com.FinalProject.EmployeeSchedulingTool.Repository.EmployeeRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class EmployeeRepositoryTests {
	
	@Autowired private EmployeeRepository repo;
	
	@Test
	public void testAddEmployee() {
		
		Employees employee1 = new Employees();
		employee1.setEmployeeId(1);
		employee1.setEmployeeFirstName("Aaron");
		employee1.setEmployeeMiddleInitial("N");
		employee1.setEmployeeLastName("Leonard");
		employee1.setEmployeeHoursMonday("10am-4pm");
		employee1.setEmployeeHoursTuesday("10am-4pm");
		employee1.setEmployeeHoursWednesday("10am-4pm");
		employee1.setEmployeeHoursThursday("10am-4pm");
		employee1.setEmployeeHoursFriday("10am-4pm");
		employee1.setEmployeeHoursSaturday("10am-4pm");
		employee1.setEmployeeHoursSunday("10am-4pm");
		
		Employees employeeSave1 = repo.save(employee1);
		
		Assertions.assertThat(employeeSave1).isNotNull();
		
		
	}
	
}
