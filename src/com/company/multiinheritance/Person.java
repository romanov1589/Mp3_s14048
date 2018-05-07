package com.company.multiinheritance;

public abstract class Person {
    private long id;
    private String name;
    private int workingHoursPerMonth;
    private double hourlyWage;
    public abstract double getMonthlySalary();

    public Person(long id, String name, int workingHoursPerMonth, double hourlyWage) {
        this.id = id;
        this.name = name;
        this.workingHoursPerMonth = workingHoursPerMonth;
        this.hourlyWage = hourlyWage;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null){
            throw new IllegalArgumentException("Name can't be null");
        }
        this.name = name;
    }

    public int getWorkingHoursPerMonth() {
        return workingHoursPerMonth;
    }

    public void setWorkingHoursPerMonth(int workingHoursPerMonth) {
        this.workingHoursPerMonth = workingHoursPerMonth;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }
}
