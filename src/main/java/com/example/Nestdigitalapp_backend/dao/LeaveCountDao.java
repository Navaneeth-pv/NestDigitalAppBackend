package com.example.Nestdigitalapp_backend.dao;

import com.example.Nestdigitalapp_backend.model.LeaveCount;
import org.springframework.data.repository.CrudRepository;

public interface LeaveCountDao extends CrudRepository<LeaveCount,Integer> {
}
