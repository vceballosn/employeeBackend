package com.exampleCrud.crudBackend.service.imp;

import org.springframework.stereotype.Service;

import com.exampleCrud.crudBackend.dto.EmployeeDto;
import com.exampleCrud.crudBackend.entity.Employee;
import com.exampleCrud.crudBackend.mapper.EmployeeMapper;
import com.exampleCrud.crudBackend.repository.EmployeesRepository;
import com.exampleCrud.crudBackend.service.EmployeeService;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor 
public class EmployeeServiceImp implements EmployeeService {

	private EmployeesRepository employeeRepository;
	@Override
	public EmployeeDto createEmployee(EmployeeDto employeeDto) {
		// TODO Auto-generated method stub
		Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
		Employee employeeSave = employeeRepository.save(employee);
		return EmployeeMapper.mapToEmployeeDto(employeeSave);
	}
	
	@Override
	public EmployeeDto getEmployeeById(Long idEmployee) {
	    Employee employeeId = employeeRepository.findById(idEmployee)
	            .orElseThrow(() -> new EntityNotFoundException("Employee not found with id: " + idEmployee));
	    return EmployeeMapper.mapToEmployeeDto(employeeId);
	}

}
