package com.example.Nestdigitalapp_backend.dao;

import com.example.Nestdigitalapp_backend.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeDao extends CrudRepository<Employee,Integer> {
}
