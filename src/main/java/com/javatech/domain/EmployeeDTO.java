package com.javatech.domain;

import jakarta.persistence.Column;
import lombok.*;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {

    private Long id;
    private Long age;
    private String deptName;
    private String firstName;
    private String lastName;
    private Double salary;
}
