package com.company.overlappinginheritance;

import java.util.EnumSet;

public class Main {
    public static void main(String[] args) {
        Participant participant1 = new Participant(1, "Igor Romanov", "EC1111",
                "GO1111", EnumSet.of(ParticipantType.PLAYER, ParticipantType.TRAINER), 3, 5);
        System.out.println(participant1);
//        participant1.setPlayerLicense("88213");
//        System.out.println(participant1);
        participant1.setPlayerLicense("EE1111");
        System.out.println(participant1);
        System.out.println(participant1.getWorkingDaysPerYear());
        //participant1.setTrainerWorkingDaysPerWeek(10);


    }
}
