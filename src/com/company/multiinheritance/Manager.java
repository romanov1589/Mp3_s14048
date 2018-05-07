package com.company.multiinheritance;

public class Manager extends Person {
    private double monthlySalaryBonus;

    public Manager(long id, String name, int workingHoursPerMonth, double hourlyWage, double monthlySalaryBonus) {
        super(id, name, workingHoursPerMonth, hourlyWage);
        this.monthlySalaryBonus = monthlySalaryBonus;
    }

    public double getMonthlySalaryBonus() {
        return monthlySalaryBonus;
    }

    public void setMonthlySalaryBonus(double monthlySalaryBonus) {
        this.monthlySalaryBonus = monthlySalaryBonus;
    }

    @Override
    public double getMonthlySalary() {
        return (getMonthlySalaryBonus()) + (super.getWorkingHoursPerMonth()*super.getHourlyWage());
    }

}
