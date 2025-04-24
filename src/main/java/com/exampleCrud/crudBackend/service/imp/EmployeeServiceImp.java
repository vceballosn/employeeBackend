package com.exampleCrud.crudBackend.service.imp;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.exampleCrud.crudBackend.dto.EmployeeDto;
import com.exampleCrud.crudBackend.entity.Employee;
import com.exampleCrud.crudBackend.mapper.EmployeeMapper;
import com.exampleCrud.crudBackend.repository.EmployeesRepository;
import com.exampleCrud.crudBackend.service.EmployeeService;

import jakarta.persistence.EntityNotFoundException;
import com.exampleCrud.crudBackend.exception.ResourceNotFoundException;

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
	            .orElseThrow(() -> new ResourceNotFoundException("Employee not found with id: " + idEmployee));
	    return EmployeeMapper.mapToEmployeeDto(employeeId);
	}

	@Override
	public List<EmployeeDto> getAllEmployee() {
	    List<Employee> empleados = employeeRepository.findAll();
	    return empleados.stream()
	            .map(empleado -> EmployeeMapper.mapToEmployeeDto(empleado))
	            .collect(Collectors.toList());
	}
}
