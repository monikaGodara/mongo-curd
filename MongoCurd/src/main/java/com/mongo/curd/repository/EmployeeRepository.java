package com.mongo.curd.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongo.curd.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee,Integer>{

}
