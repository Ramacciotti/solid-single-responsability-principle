package com.ramacciotti.single_responsability.rigth_example.service;

import com.ramacciotti.single_responsability.rigth_example.entity.Employee;
import com.ramacciotti.single_responsability.rigth_example.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public Employee getEmployee(Long id) throws ClassNotFoundException {

        Employee employee = employeeRepository.getReferenceById(id);

        if (employee == null) {

            throw new ClassNotFoundException("employee_not_found");

        } else {

            return employee;

        }

    }

}
