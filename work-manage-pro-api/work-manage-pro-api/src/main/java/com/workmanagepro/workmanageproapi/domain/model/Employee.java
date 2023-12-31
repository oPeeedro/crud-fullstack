package com.workmanagepro.workmanageproapi.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private Long id;
    private String name;
    private String email;
    private String department;
    //    private LocalDate hireDate;
    private BigDecimal salary;
    private Integer age;
    private String position;
    private Boolean active;
}
