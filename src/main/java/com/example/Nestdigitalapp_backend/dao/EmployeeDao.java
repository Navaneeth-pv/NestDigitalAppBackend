package com.example.Nestdigitalapp_backend.dao;

import com.example.Nestdigitalapp_backend.model.Employee;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeDao extends CrudRepository<Employee,Integer> {

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM `employee` WHERE `id` =:id",nativeQuery = true)
    void deleteEmployee(@Param("id") Integer id);

    @Query(value = "SELECT `id`, `empcode`, `empdesignation`, `empname`, `emppassword`, `empusername` FROM `employee` WHERE `empcode` LIKE %:empcode%",nativeQuery = true)
    List<Employee> SearchEmployee(@Param("empcode") String empcode);

    @Query(value = "SELECT `id`, `empcode`, `empdesignation`, `empname`, `emppassword`, `empusername` FROM `employee` WHERE `empusername`=:empusername AND `emppassword`=:emppassword",nativeQuery = true)
    List<Employee> UserLoginDetails(@Param("empusername")String empusername,@Param("emppassword")String emppassword);
}
