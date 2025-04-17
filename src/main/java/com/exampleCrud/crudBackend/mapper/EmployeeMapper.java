package com.exampleCrud.crudBackend.mapper;

import com.exampleCrud.crudBackend.dto.EmployeeDto;
import com.exampleCrud.crudBackend.entity.Employee;

public class EmployeeMapper {
	
	public static EmployeeDto mapToEmployeeDto(Employee employee) {
		
		return new EmployeeDto(employee.getId(),
				employee.getFirstName(),
				employee.getLastName(),
				employee.getEmail()
				);
	}
	
	public static Employee mapToEmployee (EmployeeDto employeeDto) {
		
		return new Employee( employeeDto.getId(),
				employeeDto.getFirstName(),
				employeeDto.getLastName(),
				employeeDto.getEmail()
				);
	}

}
