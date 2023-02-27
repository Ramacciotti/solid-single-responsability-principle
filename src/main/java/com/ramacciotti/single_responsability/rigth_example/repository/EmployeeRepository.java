package com.ramacciotti.single_responsability.rigth_example.repository;

import com.ramacciotti.single_responsability.rigth_example.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}