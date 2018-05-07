package com.company.overlappinginheritance;

public class Main {
    public static void main(String[] args) {
        Participant participant1 = new Participant(1, "Igor Romanov");
        System.out.println(participant1);
        participant1.becomeFan();
        System.out.println(participant1);
        participant1.becomePlayer("EG1100");
        System.out.println(participant1);
        participant1.becomeTrainer("ES1132");
        System.out.println(participant1);
        participant1.stopBeingPlayer();
        System.out.println(participant1);
    }
}
