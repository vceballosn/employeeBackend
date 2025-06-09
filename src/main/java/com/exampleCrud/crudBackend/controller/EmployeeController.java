package com.exampleCrud.crudBackend.controller;

import com.exampleCrud.crudBackend.dto.EmployeeDto;
import com.exampleCrud.crudBackend.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin("*")
@AllArgsConstructor // Inyección de dependencias a través del constructor (recomendado)
@RestController
@RequestMapping("api/v1/employees") // Path base para todos los endpoints de este controlador
public class EmployeeController {

    private final EmployeeService employeeService; // Inyecta el servicio, no la aplicación principal

    // No es necesario un constructor adicional si estás usando @AllArgsConstructor
    // para inyectar dependencias.  Spring lo maneja por ti.

    @PostMapping
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto) {
        EmployeeDto savedEmployeeDto = employeeService.createEmployee(employeeDto);
        return new ResponseEntity<>(savedEmployeeDto, HttpStatus.CREATED);
    }

    @GetMapping("/{id}") // Path variable dentro de la anotación
    public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable Long id) { // Usa nombres de variables más cortos y descriptivos
        EmployeeDto employeeDto = employeeService.getEmployeeById(id);
        return ResponseEntity.ok(employeeDto);
    }

    @GetMapping
    public ResponseEntity<List<EmployeeDto>> getAllEmployees() {
        List<EmployeeDto> employees = employeeService.getAllEmployee();
        return ResponseEntity.ok(employees);
    }

    @PutMapping() // Path variable dentro de la anotación
    public ResponseEntity<EmployeeDto> updateEmployee(@RequestBody EmployeeDto employeeDto) { // Usa nombres de variables más cortos y descriptivos
        EmployeeDto updatedEmployeeDto = employeeService.updateEmployee(employeeDto);
        return ResponseEntity.ok(updatedEmployeeDto);
    }

    @DeleteMapping("/{id}") // Path variable dentro de la anotación
    public ResponseEntity<String> deleteEmployee(@PathVariable Long id) { // Usa nombres de variables más cortos y descriptivos
        employeeService.deleteEmployee(id);
        return ResponseEntity.ok("Employee deleted successfully."); // Mensaje más claro
    }
}
