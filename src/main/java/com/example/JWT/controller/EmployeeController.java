package com.example.JWT.controller;

import com.example.JWT.model.Employee;
import com.example.JWT.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/employees")
    public List<Employee> getEmployees(){
        return employeeRepository.findAll();
    }

    @PostMapping("/create")
    public ResponseEntity save(@RequestBody Employee employee) {
        employee.setPassword(hashPassword(employee.getPassword()));
        return ResponseEntity.ok(this.employeeRepository.save(employee));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity update(@PathVariable("id") long id, @RequestBody Employee employee){
        return ResponseEntity.ok(this.employeeRepository.save(employee));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity remove(@PathVariable("id") long id) throws Exception {
        Employee employee = this.employeeRepository.findById(id).orElseThrow(() -> new Exception());
        this.employeeRepository.delete(employee);
        return ResponseEntity.ok(true);
    }

    private String hashPassword(String plainTextPassword){
        return BCrypt.hashpw(plainTextPassword, BCrypt.gensalt());
    }
}
