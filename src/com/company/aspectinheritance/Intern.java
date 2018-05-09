package com.company.aspectinheritance;

public class Intern extends Status {
    private Long internshipWeeks;

    public Intern(Long internshipWeeks) {
        this.internshipWeeks = internshipWeeks;
    }

    public long getInternshipWeeks() {
        return internshipWeeks;
    }

    public void setInternshipWeeks(Long internshipWeeks) {
        this.internshipWeeks = internshipWeeks;
    }

    public String toString() {
        return "Internship weeks: " + getInternshipWeeks();
    }
}
