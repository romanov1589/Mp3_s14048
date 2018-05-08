package com.company.aspectinheritance;

public class Employee {
    private int id;
    private String name;
    private int workingHoursPerMonth;
    private double hourlyWage;

    private Intern intern;
    private Manager manager;
    private Gender gender;

    public Employee(int id, String name, int workingHoursPerMonth, double hourlyWage, EmployeeType employeeType, EmployeeGender employeeGender) {
        this.id = id;
        this.setName(name);
        this.workingHoursPerMonth = workingHoursPerMonth;
        this.hourlyWage = hourlyWage;
        if(employeeType == EmployeeType.INTERN){
            this.intern = new Intern(this);
            this.manager = null;
        }else if(employeeType == EmployeeType.MANAGER){
            this.manager = new Manager(this);
            this.intern = null;
        }else{
            this.manager = null;
            this.intern = null;
        }
        if(employeeGender == EmployeeGender.FEMALE){
            this.gender = new Female();
        }else if(employeeGender == EmployeeGender.MALE){
            this.gender = new Male();
        }
    }

    public void becomeIntern(){
        if(!isIntern()){
            this.intern = new Intern(this);
            this.manager = null;
        }
    }

    private boolean isIntern() {
        if(this.intern != null){
            return true;
        }
        return false;
    }

    public void becomeManager(){
        if(!isManager()){
            this.intern = null;
            this.manager = new Manager(this);
        }
    }

    private boolean isManager() {
        if(this.manager != null){
            return true;
        }
        return false;
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

    public double getManagerBonus(){
        if(isManager()) {
            return getManager().getBonus();
        }
        return 0;
    }

    public void setManagerBonus(double managerBonus){
        if(isManager()) {
            getManager().setBonus(managerBonus);
        }
    }

    public double getSalary(){
         if(isManager()){
            return getManagerBonus() + (hourlyWage*workingHoursPerMonth);
        }else{
            return hourlyWage * workingHoursPerMonth;
        }
    }

    public Intern getIntern() {
        return intern;
    }

    public Manager getManager() {
        return manager;
    }

    public Gender getGender(){
        return gender;
    }

    public String toString(){
        return getId() + " " + getName() + "\n" + "Intern: " + isIntern() + "\n" + "Manager: " + isManager();
    }
}
