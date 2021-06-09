package com.gopalsoft.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.gopalsoft.entity.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String>{

}
