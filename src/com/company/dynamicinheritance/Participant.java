package com.company.dynamicinheritance;

public class Participant {
    private long id;
    private String name;
    private String playerLicense;
    private String trainerLicense;
    private Trainer trainer;
    private Fan fan;
    private Player player;

    public Participant(long id, String name, ParticipantType type) {
        this.id = id;
        this.setName(name);
        if(type == ParticipantType.FAN){
            this.fan = new Fan(this);
            this.player=null;
            this.trainer=null;
        }else if(type == ParticipantType.PLAYER){
            this.player = new Player(this);
            this.trainer = null;
            this.fan = null;
        }else if(type == ParticipantType.TRAINER){
            this.trainer = new Trainer(this);
            this.player = null;
            this.fan = null;
        }else{
            this.player = null;
            this.trainer = null;
            this.fan = null;
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
            throw new IllegalArgumentException("Name can't be null");
        }
        this.name = name;
    }

    public void becomeFan(){
        if(!isFan()){
            this.fan = new Fan(this);
            this.player = null;
            this.trainer = null;
        }
    }

    public void becomePlayer(){
        if(!isPlayer()){
            this.player = new Player(this);
            this.fan = null;
            this.trainer = null;
        }
    }

    public void becomeTrainer(){
        if(!isTrainer()){
            this.trainer = new Trainer(this);
            this.player = null;
            this.fan = null;
        }
    }

    public void becomeParticipant(){
        this.player = null;
        this.trainer = null;
        this.fan = null;
    }

    public boolean isFan(){
        if(this.fan!=null){
            return true;
        }
        return false;
    }

    public boolean isPlayer(){
        if(this.player!=null){
            return true;
        }
        return false;
    }

    public boolean isTrainer(){
        if(this.trainer!=null){
            return true;
        }
        return false;
    }

    public void setPlayerLicense(String playerLicense){
        if(isPlayer()) {
            this.playerLicense = playerLicense;
            this.trainerLicense = null;
        }
    }

    public void setTrainerLicense(String trainerLicense){
        if(isTrainer()){
            this.trainerLicense = trainerLicense;
            this.playerLicense = null;
        }
    }

    public String getPlayerLicense() {
        return playerLicense;
    }

    public String getTrainerLicense() {
        return trainerLicense;
    }

    public String toString(){
        return getId() + " " + getName() + "\n" + "Player: " + isPlayer() + "\n" + "Trainer: " + isTrainer()
                + '\n' + "Fan: " + isFan();
    }

}
