package com.example.JWT.service;

import com.example.JWT.model.Employee;
import com.example.JWT.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class JwtUserDetailService implements UserDetailsService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Employee existing  = this.employeeRepository.findByUsername(username);
        if(existing.getUsername() != null){
            return new User(existing.getUsername(), existing.getPassword(), new ArrayList<>());
        }else {
            throw new UsernameNotFoundException("User with this username : ${username} not found");
        }

    }
}
