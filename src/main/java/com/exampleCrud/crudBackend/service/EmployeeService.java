package com.exampleCrud.crudBackend.service;

import java.util.List;

import com.exampleCrud.crudBackend.dto.EmployeeDto;

public interface EmployeeService {
	
	EmployeeDto createEmployee(EmployeeDto employeeDto);
    EmployeeDto getEmployeeById(Long idEmployee);
    List<EmployeeDto> getAllEmployee();
    EmployeeDto updateEmployee(EmployeeDto employeeUpdate);
    void deleteEmployee(Long employeeId);

}
