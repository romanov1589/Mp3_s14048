package com.company.dynamicinheritance;

public class Fan {
    private Participant participant;

    public Fan(Participant participant) {
        if (participant == null) {
            throw new IllegalArgumentException("Participant can't be null");
        }
        this.participant = participant;
    }

    public String play() {
        return "Play as amateur";
    }
}
