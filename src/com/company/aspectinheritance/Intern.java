package com.company.aspectinheritance;

public class Intern {
    private Employee employee;
    public Intern(Employee employee) {
        if(employee == null){
            throw new IllegalArgumentException("Employee can't be null");
        }
        this.employee=employee;
    }
}
