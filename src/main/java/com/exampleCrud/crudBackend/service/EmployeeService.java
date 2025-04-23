package com.exampleCrud.crudBackend.service;

import com.exampleCrud.crudBackend.dto.EmployeeDto;

public interface EmployeeService {
	
	EmployeeDto createEmployee(EmployeeDto employeeDto);
    EmployeeDto getEmployeeById(Long idEmployee);

}
