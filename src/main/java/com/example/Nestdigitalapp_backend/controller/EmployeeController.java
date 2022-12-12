package com.example.Nestdigitalapp_backend.controller;

import com.example.Nestdigitalapp_backend.dao.EmployeeDao;
import com.example.Nestdigitalapp_backend.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeDao empdao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addemployee",consumes = "application/json",produces = "application/json")
    public String AddEmployee(@RequestBody Employee emp){
        System.out.println(emp.getEmpcode().toString());
        System.out.println(emp.getEmpname().toString());
        System.out.println(emp.getEmpdesignation().toString());
        System.out.println(emp.getEmpusername().toString());
        System.out.println(emp.getEmppassword().toString());

        empdao.save(emp);
        return "Employee Added Successfully";

    }

    @CrossOrigin(origins = "*")
    @GetMapping(path = "/viewemployee",consumes = "application/json",produces = "application/json")
    public List<Employee> ViewEmployee(){
        return (List<Employee>) empdao.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/deleteemployee",consumes = "application/json",produces = "application/json")
    public String DeleteEmployee(){
        return "Emp delete page";

    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/searchemployee",consumes = "application/json",produces = "application/json")
    public String SearchEmployee(){
        return "search employee";
    }

}
