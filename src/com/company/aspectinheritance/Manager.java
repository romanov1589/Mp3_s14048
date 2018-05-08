package com.company.aspectinheritance;

import java.time.LocalDate;

public class Manager extends Employee {
    private double bonus;

    public Manager(int id, String name, int workingHoursPerMonth, double hourlyWage, double bonus,
                   StatusType statusType, LocalDate hired, long internshipWeeks) {
        super(id, name, workingHoursPerMonth, hourlyWage, statusType, hired, internshipWeeks);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }


    @Override
    public double getMonthlySalary() {
        return (super.getHourlyWage() * super.getWorkingHoursPerMonth()) + getBonus();
    }
}
