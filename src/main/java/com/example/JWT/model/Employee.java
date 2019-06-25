package com.example.JWT.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
//    @Getter @Setter
    private String firstName;

    @Column
//    @Getter @Setter
    private String lastName;

    @Column
//    @Getter @Setter
    private int age;

    @Column
//    @Getter @Setter
    private String gender;

    @Column
//    @Getter @Setter
    private long salary;

    @Column
//    @Getter @Setter
    private boolean currentyWithOrganization;

    @Column
//    @Getter @Setter
    private String username;

    @Column
//    @Getter @Setter
    private String password;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public boolean isCurrentyWithOrganization() {
		return currentyWithOrganization;
	}

	public void setCurrentyWithOrganization(boolean currentyWithOrganization) {
		this.currentyWithOrganization = currentyWithOrganization;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
