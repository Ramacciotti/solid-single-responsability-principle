package com.ramacciotti.single_responsability.rigth_example.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private Long id; // right, it refers to Employee
    private String name; // right, it refers to Employee
    private String email; // right, it refers to Employee

    private Address address; // here, we separate responsabilities

    // Now, Employee will only handle its fields and Address will handle their own
    // If we want to modify Employee we DONT need to modify Address also

}
