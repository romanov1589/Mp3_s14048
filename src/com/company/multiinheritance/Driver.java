package com.company.multiinheritance;

public class Driver extends Person {
    private int ridesPerMonth;
    private static double bonusPerRide;

    public Driver(long id, String name, int workingHoursPerMonth, double hourlyWage, int ridesPerMonth) {
        super(id, name, workingHoursPerMonth, hourlyWage);
        this.ridesPerMonth = ridesPerMonth;
    }

    public int getRidesPerMonth() {
        return ridesPerMonth;
    }

    public void setRidesPerMonth(int ridesPerMonth) {
        this.ridesPerMonth = ridesPerMonth;
    }

    public double getBonusPerRide() {
        return bonusPerRide;
    }

    public void setBonusPerRide(double bonusPerRide) {
        this.bonusPerRide = bonusPerRide;
    }



    public double getDriversMonthlyBonus() {
        return ridesPerMonth*bonusPerRide;
    }

    @Override
    public double getMonthlySalary() {
        return getDriversMonthlyBonus() + (super.getWorkingHoursPerMonth()*super.getHourlyWage());
    }
}
