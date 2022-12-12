package com.example.Nestdigitalapp_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue()

    private int id;
    private int empcode;
    private String empdesignation;
    private String empusername;
    private String emppassword;

    public Employee() {
    }

    public Employee(int id, int empcode, String empdesignation, String empusername, String emppassword) {
        this.id = id;
        this.empcode = empcode;
        this.empdesignation = empdesignation;
        this.empusername = empusername;
        this.emppassword = emppassword;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmpcode() {
        return empcode;
    }

    public void setEmpcode(int empcode) {
        this.empcode = empcode;
    }

    public String getEmpdesignation() {
        return empdesignation;
    }

    public void setEmpdesignation(String empdesignation) {
        this.empdesignation = empdesignation;
    }

    public String getEmpusername() {
        return empusername;
    }

    public void setEmpusername(String empusername) {
        this.empusername = empusername;
    }

    public String getEmppassword() {
        return emppassword;
    }

    public void setEmppassword(String emppassword) {
        this.emppassword = emppassword;
    }
}
