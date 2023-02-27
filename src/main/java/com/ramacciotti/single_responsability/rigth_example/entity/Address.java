package com.ramacciotti.single_responsability.rigth_example.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    private String state; // right, this item refers do Address
    private String City; // right, this item refers do Address

}
