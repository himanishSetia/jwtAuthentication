package com.example.JWT.repository;

import com.example.JWT.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    public Employee findByUsername(String username);
}
