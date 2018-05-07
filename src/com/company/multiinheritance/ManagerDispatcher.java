package com.company.multiinheritance;

public class ManagerDispatcher extends Manager implements IDispatcher {
    private int soldBiletsPerMonth;
    private double bonusPerBilet;

    public ManagerDispatcher(long id, String name, int workingHoursPerMonth, double hourlyWage,
                             double monthlySalaryBonus, int soldBiletsPerMonth, double bonusPerBilet) {
        super(id, name, workingHoursPerMonth, hourlyWage, monthlySalaryBonus);
        this.soldBiletsPerMonth = soldBiletsPerMonth;
        this.bonusPerBilet = bonusPerBilet;
    }


    public int getSoldBiletsPerMonth() {
        return soldBiletsPerMonth;
    }

    public void setSoldBiletsPerMonth(int soldBiletsPerMonth) {
        this.soldBiletsPerMonth = soldBiletsPerMonth;
    }

    public double getBonusPerBilet() {
        return bonusPerBilet;
    }

    public void setBonusPerBilet(double bonusPerBilet) {
        this.bonusPerBilet = bonusPerBilet;
    }

    @Override
    public double getMonthlyDispatcherBonus() {
        return soldBiletsPerMonth*bonusPerBilet;
    }

    @Override
    public double getMonthlySalary() {
        return getMonthlyDispatcherBonus() + super.getMonthlySalary();
    }
}
