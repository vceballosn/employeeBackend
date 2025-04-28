package com.exampleCrud.crudBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exampleCrud.crudBackend.entity.Employee;

public interface EmployeesRepository   extends JpaRepository<Employee, Long>  {

}
