package org.example.SchoolProject.entity;

import org.example.SchoolProject.enums.Role;

import java.math.BigDecimal;

public class Teacher extends User {
    public Role role;
    private String Specialization;

    @Override
    public String toString() {
        return "Teacher{" +
                "role=" + role +
                ", Specialization='" + Specialization + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getSpecialization() {
        return Specialization;
    }

    public void setSpecialization(String specialization) {
        Specialization = specialization;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public Teacher(Role role, String specialization, BigDecimal salary) {
        this.role = role;
        Specialization = specialization;
        this.salary = salary;
    }

    BigDecimal salary;
}
