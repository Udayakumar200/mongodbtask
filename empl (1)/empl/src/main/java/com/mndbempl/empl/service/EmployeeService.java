package com.mndbempl.empl.service;

import com.mndbempl.empl.dto.employeeDTO;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface EmployeeService {
    employeeDTO createemployee(employeeDTO EmployeeDTO);
    employeeDTO getemployeeById(Long EmployeeId);
    List<employeeDTO> getAllemployees();
    employeeDTO updateemployee(Long EmployeeId, employeeDTO updatedemployee);
    void deleteemployee(Long EmployeeId);
    employeeDTO viewemployee(Long EmployeeId);
}
