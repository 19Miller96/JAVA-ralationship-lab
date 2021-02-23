package com.codeclan.example.EmployeeRelationshipLab.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "projectName")
    private String projectName;

    @Column(name = "duration")
    private int duration;

    @ManyToMany
    @JsonIgnoreProperties({"departments"})
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            name = "employees_projects",
            joinColumns = {@JoinColumn(
                    name = "project_id",
                    nullable = false,
                    updatable = false)

            },
            inverseJoinColumns = { @JoinColumn(
                    name= "employee_id",
                    nullable = false,
                    updatable = false)
            })
    private List<Employee> employees;

    public Project(String projectName, int duration) {
        this.projectName = projectName;
        this.duration = duration;
        this.employees = new ArrayList<>();
    }

    private Project(){};

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public List<Employee> getEmployeeList() {
        return employees;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employees = employeeList;
    }

    public void addToProject(Employee employee){
        this.employees.add(employee);

    }
}
