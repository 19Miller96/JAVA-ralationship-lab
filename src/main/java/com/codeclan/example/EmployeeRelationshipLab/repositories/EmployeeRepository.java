package com.codeclan.example.EmployeeRelationshipLab.repositories;

import com.codeclan.example.EmployeeRelationshipLab.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
