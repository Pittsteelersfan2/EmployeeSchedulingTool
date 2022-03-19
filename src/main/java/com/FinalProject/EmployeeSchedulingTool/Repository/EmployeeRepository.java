/**
 * 
 * This interface is called EmployeeRepository. It extends the JpaRepository class and is used to create
 * a repo object in another class.
 * 
 */

package com.FinalProject.EmployeeSchedulingTool.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.FinalProject.EmployeeSchedulingTool.Model.Employees;

//Create blueprint for a repository object to be created in another class.
@Repository
public interface EmployeeRepository extends JpaRepository<Employees, Long> {
	
}
