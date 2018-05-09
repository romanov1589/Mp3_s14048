package com.company.aspectinheritance;

import java.time.LocalDate;

public abstract class Employee {
    private int id;
    private String name;
    private int workingHoursPerMonth;
    private double hourlyWage;
    private Status status;

    public abstract double getMonthlySalary();


    public Employee(int id, String name, int workingHoursPerMonth, double hourlyWage, StatusType statusType,
                    LocalDate hired, Long internshipWeeks) {
        this.id = id;
        this.setName(name);
        this.workingHoursPerMonth = workingHoursPerMonth;
        this.hourlyWage = hourlyWage;
        if (statusType == StatusType.INTERN) {
            this.status = new Intern(internshipWeeks);
        } else if (statusType == StatusType.WORKER) {
            this.status = new Worker(hired);
        }
    }

    public void becomeWorker(LocalDate hired) {
//        if(this.status instanceof Worker){
//            throw new IllegalArgumentException("You are worker now");
//        }
        this.status = new Worker(hired);
    }

    public void becomeIntern(long internshipWeeks) {
//        if(this.status instanceof Intern){
//            throw new IllegalArgumentException("You are intern now");
//        }
        this.status = new Intern(internshipWeeks);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
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

    public String toString() {
        return getId() + " " + getName() + " Salary: " + getMonthlySalary() + "\n" + "Status: " + getStatus();
    }

    public Status getStatus() {
        return status;
    }
}
