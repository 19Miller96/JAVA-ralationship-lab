package com.codeclan.example.EmployeeRelationshipLab;

import com.codeclan.example.EmployeeRelationshipLab.models.Department;
import com.codeclan.example.EmployeeRelationshipLab.models.Employee;
import com.codeclan.example.EmployeeRelationshipLab.models.Project;
import com.codeclan.example.EmployeeRelationshipLab.repositories.DepartmentRepository;
import com.codeclan.example.EmployeeRelationshipLab.repositories.EmployeeRepository;
import com.codeclan.example.EmployeeRelationshipLab.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class EmployeeRelationshipLabApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void saveEmployeeAndDepartment() {
		Department department = new Department("Shoes");

		Employee employee = new Employee("Worky", "McWorkface", 25, "work12345", department);

		Project project = new Project("Operation mind fuck",30);


		departmentRepository.save(department);
		employeeRepository.save(employee);
		projectRepository.save(project);

		project.addToProject(employee);
		projectRepository.save(project);




	}
}
