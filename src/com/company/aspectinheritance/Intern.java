package com.company.aspectinheritance;

public class Intern extends Status {
    private long internshipWeeks;

    public Intern(long internshipWeeks) {
        this.internshipWeeks = internshipWeeks;
    }

    public long getInternshipWeeks() {
        return internshipWeeks;
    }

    public void setInternshipWeeks(long internshipWeeks) {
        this.internshipWeeks = internshipWeeks;
    }

    public String toString() {
        return "Internship weeks: " + getInternshipWeeks();
    }
}
