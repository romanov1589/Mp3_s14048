package com.company.dynamicinheritance;


public class Main {
    public static void main(String[] args) {
        Participant participant1 = new Participant(1, "Igor Romanov", ParticipantType.PLAYER, "RR1331", null);
        System.out.println(participant1);
        participant1.becomeFan();
        System.out.println(participant1);
        participant1.becomeTrainer("TT19008");
//        System.out.println(participant1);
//        participant1.setPlayerLicense("AA1111");
        System.out.println(participant1);
        participant1.setTrainerLicense("AS2231");
        System.out.println(participant1);
        System.out.println(participant1.play());
//        participant1.getTrainer().setTrainerLicense("AA7654");
//        System.out.println(participant1.getTrainer().getTrainerLicense());


    }
}
