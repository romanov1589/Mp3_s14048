package com.company.aspectinheritance;

public class Manager {
    private double bonus;
    private Employee employee;

    public Manager(Employee employee) {
        if(employee == null){
            throw new IllegalArgumentException("Employee can't be null");
        }
        this.employee = employee;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
