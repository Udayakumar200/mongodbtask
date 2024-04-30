package com.mndbempl.empl.mapper;

import com.mndbempl.empl.dto.employeeDTO;
import com.mndbempl.empl.entity.employee;

public class employeemap {
    public static employeeDTO mapToemployeeDTO(employee Employee){
        return new employeeDTO(
                Employee.getId(),
                Employee.getEmployeeName(),
                Employee.getEmail(),
                Employee.getLocation()
        );
    }
    public static employee mapToemployee(employeeDTO EmployeeDTO) {
        return new employee(
                EmployeeDTO.getId(),
                EmployeeDTO.getEmployeeName(),
                EmployeeDTO.getEmail(),
                EmployeeDTO.getLocation()
        );
    }

}
