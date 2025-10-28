package com.example.yesh1.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.yesh1.model.Employee;

public interface EmpRepo extends CrudRepository<Employee, Integer>{

}
