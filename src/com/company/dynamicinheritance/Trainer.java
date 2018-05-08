package com.company.dynamicinheritance;

public class Trainer {
    private String trainerLicense;
    private Participant participant;

    public Trainer(Participant participant, String trainerLicense) {
        if(participant == null){
            throw new IllegalArgumentException("Participant can't be null");
        }
        this.participant = participant;
        this.setTrainerLicense(trainerLicense);
    }

    public String play(){
        return "Play as professional treainer";
    }

    public String getTrainerLicense() {
        return trainerLicense;
    }

    public void setTrainerLicense(String trainerLicense) {
        if(trainerLicense == null){
            throw new IllegalArgumentException("Trainer license can't be null");
        }
        this.trainerLicense = trainerLicense;
    }

}
