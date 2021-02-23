package com.codeclan.example.EmployeeRelationshipLab.repositories;

import com.codeclan.example.EmployeeRelationshipLab.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
