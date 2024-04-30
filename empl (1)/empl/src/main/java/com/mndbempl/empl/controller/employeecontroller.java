package com.mndbempl.empl.controller;


import com.mndbempl.empl.dto.employeeDTO;
import com.mndbempl.empl.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@AllArgsConstructor
@RestController
@RequestMapping("/api/employees")
public class employeecontroller {
    private final EmployeeService employeeService;
    @PostMapping
    public ResponseEntity<employeeDTO> createemployee(@RequestBody employeeDTO EmployeeDTO) {
        employeeDTO savedemployee = employeeService.createemployee(EmployeeDTO);
        return new ResponseEntity<>(savedemployee, HttpStatus.CREATED);
    }
    @GetMapping("{id}")
    public ResponseEntity<employeeDTO> getemployeeById(@PathVariable("id") Long EmployeeId) {
        employeeDTO EmployeeDTO = employeeService.getemployeeById(EmployeeId);
        return ResponseEntity.ok(EmployeeDTO);
    }
    @GetMapping
    public ResponseEntity<List<employeeDTO>> getAllemployees() {
        List<employeeDTO> Employees = employeeService.getAllemployees();
        return ResponseEntity.ok(Employees);
    }
    @PutMapping("{id}")
    public ResponseEntity<employeeDTO> updateemployee(@PathVariable("id") Long EmployeeId, @RequestBody employeeDTO updatedemployee) {
        employeeDTO Employeedto = employeeService.updateemployee(EmployeeId, updatedemployee);
        return ResponseEntity.ok(Employeedto);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteemployee(@PathVariable("id") Long EmployeeId) {
        employeeService.deleteemployee(EmployeeId);
        return ResponseEntity.ok("Employee Deleted Successfully!");
    }
    @GetMapping("/{id}/view")
    public ResponseEntity<employeeDTO> viewemployee(@PathVariable("id") Long EmployeeId) {
        employeeDTO employeeDto = employeeService.viewemployee(EmployeeId);
        return ResponseEntity.ok(employeeDto);
    }

}
