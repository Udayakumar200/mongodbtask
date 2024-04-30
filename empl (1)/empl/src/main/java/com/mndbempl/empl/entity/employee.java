package com.mndbempl.empl.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "employee")
public class employee {
    @Id
    private Long id;

    private String employeeName;

    private String email;

    private String Location;
}
