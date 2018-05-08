package com.company.aspectinheritance;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;


public class Worker extends Status {
    private LocalDate hired;

    public Worker(LocalDate hired) {
        this.setHired(hired);
    }

    public long getSeniorityDays() {
        return DAYS.between(getHired(), LocalDate.now());
    }

    public LocalDate getHired() {
        return hired;
    }

    public void setHired(LocalDate hired) {
        if (hired == null) {
            throw new IllegalArgumentException("Hired Date can't be null");
        }
        this.hired = hired;
    }

    public String toString() {
        return "worker; hired " + getSeniorityDays() + " ago";
    }
}
