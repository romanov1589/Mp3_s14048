package com.company.dynamicinheritance;

public class Player {
    //private String playerLicense;
    private Participant participant;

    public Player(Participant participant) {
        if(participant == null){
            throw new IllegalArgumentException("Participant can't be null");
        }
        this.participant = participant;
    }

//    public String getPlayerLicense() {
//        return playerLicense;
//    }
//
//    public void setPlayerLicense(String playerLicense) {
//        if(playerLicense == null){
//            throw new IllegalArgumentException("Player licanse can't be null");
//        }
//        this.playerLicense = playerLicense;
//    }
}
