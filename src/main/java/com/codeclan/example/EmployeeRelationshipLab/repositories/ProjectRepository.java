package com.codeclan.example.EmployeeRelationshipLab.repositories;

import com.codeclan.example.EmployeeRelationshipLab.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
