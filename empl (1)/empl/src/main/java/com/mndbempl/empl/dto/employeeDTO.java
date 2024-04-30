package com.mndbempl.empl.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class employeeDTO {
    private Long id;

    private String employeeName;

    private String email;

    private String Location;
}
