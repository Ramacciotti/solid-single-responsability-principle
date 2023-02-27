package com.ramacciotti.single_responsability.wrong_example.entity;

import com.ramacciotti.single_responsability.wrong_example.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Autowired
    EmployeeRepository employeeRepository; // this should not be here

    private Long id; // right, it refers to Employee
    private String name; // right, it refers to Employee
    private String email; // right, it refers to Employee

    // The task of this class is not only handle Employee BUT ALSO Address.
    // So, if we want to modify Employee we WILL need to modify Address also

    private String state; // wrong, this item refers do Address
    private String city; // wrong, this item refers do Address

    // Employee should not be responsible to save itself on the database.
    // We should NOT write any saving or business logic here. This should be in a separate SERVICE class
    private void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

}
