package com.company.dynamicinheritance;


public class Main {
    public static void main(String[] args) {
        Participant participant1 = new Participant(1,"Igor Romanov", null);
        System.out.println(participant1);
        participant1.becomeFan();
        System.out.println(participant1);
        participant1.becomeTrainer();
//        System.out.println(participant1);
//        participant1.becomeParticipant();
//        System.out.println(participant1);
        participant1.getTrainer().setTrainerLicense("AA7654");
        System.out.println(participant1.getTrainer().getTrainerLicense());


    }
}
