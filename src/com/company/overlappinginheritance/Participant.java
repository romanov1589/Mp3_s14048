package com.company.overlappinginheritance;

import java.util.EnumSet;

public class Participant {
    private long id;
    private String name;
    private String playerLicense;
    private String trainerLicense;

    //nie zmieniamy stanu. wszystko w konstruktorze. sprawdzenie kym jest.

    private EnumSet<ParticipantType> participantTypes = EnumSet.of(ParticipantType.PARTICIPANT);


    public Participant(long id, String name) {
        this.id = id;
        this.setName(name);
    }

    public void becomeFan(){
        if(!participantTypes.contains(ParticipantType.FAN)){
            participantTypes.add(ParticipantType.FAN);
        }
    }

    public void stopBeingFan(){
        if(participantTypes.contains(ParticipantType.FAN)){
            participantTypes.remove(ParticipantType.FAN);
        }
    }

    public void becomePlayer(String playerLicense){
        this.setPlayerLicense(playerLicense);
        if(!participantTypes.contains(ParticipantType.PLAYER)){
            participantTypes.add(ParticipantType.PLAYER);
        }
    }

    public void stopBeingPlayer(){
        if(participantTypes.contains(ParticipantType.PLAYER)){
            participantTypes.remove(ParticipantType.PLAYER);
            this.playerLicense = null;
        }
    }

    public void becomeTrainer(String trainerLicense){
        this.setTrainerLicense(trainerLicense);
        if(!participantTypes.contains(ParticipantType.TRAINER)){
            participantTypes.add(ParticipantType.TRAINER);
        }
    }

    public void stopBeingTrainer(){
        if(participantTypes.contains(ParticipantType.TRAINER)){
            participantTypes.remove(ParticipantType.TRAINER);
            this.trainerLicense = null;
        }
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null){
            throw new IllegalArgumentException("Name can't be null!");
        }
        this.name = name;
    }

    public String getPlayerLicense() {
        return playerLicense;
    }

    public void setPlayerLicense(String playerLicense) {
        if(playerLicense == null){
            throw new IllegalArgumentException("Player license can't be null!");
        }
        this.playerLicense = playerLicense;
    }

    public String getTrainerLicense() {
        return trainerLicense;
    }

    public void setTrainerLicense(String trainerLicense) {
        if(trainerLicense == null){
            throw new IllegalArgumentException("Trainer License can't be null!");
        }
        this.trainerLicense = trainerLicense;
    }

    public EnumSet<ParticipantType> getParticipantTypes() {
        EnumSet<ParticipantType> types = this.participantTypes;
        return types;
    }

    public String toString(){
        return getId() + " " + getName() + "\n" + (getPlayerLicense()!=null ? getPlayerLicense() : "none") + "\n"
                +(getTrainerLicense()!=null ? getTrainerLicense() : "none") + "\n" + getParticipantTypes();
    }

}
