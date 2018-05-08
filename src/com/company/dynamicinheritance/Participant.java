package com.company.dynamicinheritance;

public class Participant {
    private long id;
    private String name;
    private Trainer trainer;
    private Fan fan;
    private Player player;

    public Participant(long id, String name, ParticipantType type, String playerLicanse, String trainerLicense) {
        this.id = id;
        this.setName(name);
        if(type == ParticipantType.FAN){
            this.fan = new Fan(this);
            this.player=null;
            this.trainer=null;
        }else if(type == ParticipantType.PLAYER){
            this.player = new Player(this, playerLicanse);
            this.trainer = null;
            this.fan = null;
        }else if(type == ParticipantType.TRAINER){
            this.trainer = new Trainer(this, trainerLicense);
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

    public String play(){
        if(isPlayer()){
            return getPlayer().play();
        }else if(isTrainer()){
            return getTrainer().play();
        }else if(isFan()){
            return getFan().play();
        }else{
            return "I'm not playing";
        }
    }

    public void becomeFan(){
        if(!isFan()){
            this.fan = new Fan(this);
            this.player = null;
            this.trainer = null;
        }
    }

    public void becomePlayer(String playerLicense){
        if(!isPlayer()){
            this.player = new Player(this, playerLicense);
            this.fan = null;
            this.trainer = null;
        }
    }

    public void becomeTrainer(String trainerLicense){
        if(!isTrainer()){
            this.trainer = new Trainer(this, trainerLicense);
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
            player.setPlayerLicense(playerLicense);
        }
    }

    public void setTrainerLicense(String trainerLicense){
        if(isTrainer()){
            trainer.setTrainerLicense(trainerLicense);
        }
    }

    public String getPlayerLicense() {
        return getPlayer().getPlayerLicense();
    }

    public String getTrainerLicense() {
        return getTrainer().getTrainerLicense();
    }

    public Trainer getTrainer() {
        if(!isTrainer()){
            throw new NullPointerException("Isn't a trainer!");
        }
        return trainer;
    }

    public Player getPlayer() {
        if(!isPlayer()){
            throw new NullPointerException("Isn't a player!");
        }
        return player;
    }

    public Fan getFan() {
        if(!isFan()){
            throw new NullPointerException("Isn't a fun!");
        }
        return fan;
    }

    public String toString(){
        return getId() + " " + getName() + "\n" + "Player: " + isPlayer() + "\n" + "Trainer: " + isTrainer()
                + "\n" + "Fan: " + isFan() + "\n" + ( isPlayer() ? getPlayer().getPlayerLicense() : "")
                + (isTrainer() ? getTrainer().getTrainerLicense() : "");
    }

}
