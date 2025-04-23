package com.exampleCrud.crudBackend.controller;

import org.springframework.web.bind.annotation.RestController;


import com.exampleCrud.crudBackend.service.EmployeeService;
import com.exampleCrud.crudBackend.CrudBackendApplication;
import com.exampleCrud.crudBackend.dto.EmployeeDto;

import lombok.AllArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@AllArgsConstructor 
@RestController
@RequestMapping (path = "api/v1/employees")
public class EmployeeController {

 private EmployeeService employeeService;

    

@PostMapping
public ResponseEntity<EmployeeDto> CreateEmployee (@RequestBody EmployeeDto employeeDto){
	EmployeeDto saveEmployeeDto =	employeeService.createEmployee(employeeDto);
	return new ResponseEntity<>(saveEmployeeDto,HttpStatus.CREATED);
}


@GetMapping("{id}")
public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable("id") Long idEmployee) {
    EmployeeDto idEmployeeDto = employeeService.getEmployeeById(idEmployee);
    return ResponseEntity.ok(idEmployeeDto);
}


}
