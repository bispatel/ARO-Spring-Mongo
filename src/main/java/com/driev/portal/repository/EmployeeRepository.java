package com.driev.portal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.driev.portal.model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String>{

}
