package com.example.Nestdigitalapp_backend.dao;

import com.example.Nestdigitalapp_backend.model.LeaveApplication;
import org.springframework.data.repository.CrudRepository;

public interface LeaveApplicationDao extends CrudRepository<LeaveApplication,Integer> {
}
