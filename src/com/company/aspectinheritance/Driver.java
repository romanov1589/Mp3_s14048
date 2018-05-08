package com.company.aspectinheritance;

import java.time.LocalDate;

public class Driver extends Employee {
    public Driver(int id, String name, int workingHoursPerMonth, double hourlyWage, StatusType statusType,
                  LocalDate hired, long iternshipWeeks) {
        super(id, name, workingHoursPerMonth, hourlyWage, statusType, hired, iternshipWeeks);
    }

    @Override
    public double getMonthlySalary() {
        return super.getHourlyWage() * super.getWorkingHoursPerMonth();
    }
}
