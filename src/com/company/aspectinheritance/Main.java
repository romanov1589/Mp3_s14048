package com.company.aspectinheritance;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Manager(1, "Igor Romanov", 160, 10, 100, StatusType.WORKER,
                LocalDate.of(2018, 04, 8), 20);
        System.out.println(employee);
        Employee employee1 = new Driver(2, "Jan Kowalski", 180, 10, StatusType.INTERN,
                LocalDate.of(2018, 02, 10), 90);
        System.out.println(employee1);
        employee1.becomeWorker(LocalDate.of(2018, 04, 10));
        System.out.println(employee1);
        employee.becomeIntern(10);
        employee.becomeIntern(20);
        System.out.println(employee);
    }
}
