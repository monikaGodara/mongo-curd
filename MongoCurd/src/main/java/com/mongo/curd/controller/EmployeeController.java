package com.mongo.curd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.curd.model.Employee;
import com.mongo.curd.service.EmployeeService;

@RestController
public class EmployeeController {
@Autowired
private EmployeeService empService;

   @PostMapping("/savedata")
   public ResponseEntity<Employee> saveOrUpdate(@RequestBody Employee emp){
	  
	  return new ResponseEntity<>(empService.saveOrUpdate(emp),HttpStatus.ACCEPTED);
	   
   }
   @GetMapping("/getdata")
   public String getdata()
   {
	   return "monika";
   }
   
   @GetMapping
   public ResponseEntity<List<Employee>>findAll()
   {
	   return new ResponseEntity<List<Employee>>(empService.findAll(),HttpStatus.ACCEPTED);
   }
   
   @DeleteMapping
   public ResponseEntity<String> delete(@RequestBody Employee emp){
	   empService.delete(emp);
	   return new ResponseEntity<String>("Record deleted",HttpStatus.ACCEPTED);
   }
}
