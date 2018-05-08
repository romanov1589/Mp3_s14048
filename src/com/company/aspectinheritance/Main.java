package com.company.aspectinheritance;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "Igor Romanov", 160, 10, EmployeeType.MANAGER, EmployeeGender.MALE);
        System.out.println(employee.getGender());
        employee.setManagerBonus(100);
        System.out.println(employee);
        System.out.println(employee.getManagerBonus());
        System.out.println(employee.getSalary());
        employee.becomeIntern();
        System.out.println(employee);
        System.out.println(employee.getSalary());

    }
}
