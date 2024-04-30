package com.mndbempl.empl.service.impl;

import com.mndbempl.empl.dto.employeeDTO;
import com.mndbempl.empl.entity.employee;
import com.mndbempl.empl.excp.ResourceNotFoundException;
import com.mndbempl.empl.mapper.employeemap;
import com.mndbempl.empl.repo.employeeRepo;
import com.mndbempl.empl.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final employeeRepo Employeerepo;
    @Autowired
    public EmployeeServiceImpl(employeeRepo Employeerepo) {
        this.Employeerepo = Employeerepo;
    }

    @Override
    public employeeDTO createemployee(employeeDTO EmployeeDTO) {
        employee Employee = employeemap.mapToemployee(EmployeeDTO);
        employee savedemployee = Employeerepo.save(Employee);
        return employeemap.mapToemployeeDTO(savedemployee);
    }

    @Override
    public employeeDTO getemployeeById(Long EmployeeId) {
        employee Employee = Employeerepo.findById(EmployeeId)
                .orElseThrow(()-> new ResourceNotFoundException("Employee is not exist with given id:"+EmployeeId));
        return employeemap.mapToemployeeDTO(Employee);
    }

    @Override
    public List<employeeDTO> getAllemployees() {
        List<employee> Employees = Employeerepo.findAll();

        return Employees.stream().map((Employee)->employeemap.mapToemployeeDTO(Employee))
                .collect(Collectors.toList());
    }

    @Override
    public employeeDTO updateemployee(Long EmployeeId, employeeDTO updatedemployee) {
        employee Employee =  Employeerepo.findById(EmployeeId).orElseThrow(()-> new ResourceNotFoundException("employee is not exist with given id:"+EmployeeId));

        Employee.setEmployeeName(updatedemployee.getEmployeeName());
        Employee. setEmail(updatedemployee.getEmail());
        Employee.setLocation(updatedemployee.getLocation());
        employee updatedEmployeeObj =   Employeerepo.save(Employee);
        return employeemap.mapToemployeeDTO(updatedEmployeeObj);
    }

    @Override
    public void deleteemployee(Long EmployeeId) {
        employee Employee =  Employeerepo.findById(EmployeeId).orElseThrow(()-> new ResourceNotFoundException("employee is not exist with given id:"+EmployeeId));
        Employeerepo.deleteById(EmployeeId);
    }

    @Override
    public employeeDTO viewemployee(Long EmployeeId) {
        employee Employee = Employeerepo.findById(EmployeeId)
                .orElseThrow(() -> new ResourceNotFoundException("Employee is not exist with given id:" + EmployeeId));
        return employeemap.mapToemployeeDTO(Employee);
    }
}
