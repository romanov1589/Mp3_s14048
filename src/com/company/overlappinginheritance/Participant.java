package com.company.overlappinginheritance;

import java.util.EnumSet;

public class Participant {
    private long id;
    private String name;
    private String playerLicense;
    private String trainerLicense;
    private long playerWorkingDaysPerWeek;
    private long trainerWorkingDaysPerWeek;
    private static int weeksInTheYear = 48;
    private EnumSet<ParticipantType> participantTypes;

    public long getWorkingDaysPerYear() {
        if (isTrainer() && isPlayer()) {
            return (playerWorkingDaysPerWeek + trainerWorkingDaysPerWeek) / 2 * weeksInTheYear;
        } else if (isTrainer()) {
            return trainerWorkingDaysPerWeek * weeksInTheYear;
        } else {
            return playerWorkingDaysPerWeek * weeksInTheYear;
        }
    }

    public Participant(long id, String name, String playerLicense, String trainerLicense, EnumSet<ParticipantType> participantTypes,
                       long playerWorkingDaysPerWeek, long trainerWorkingDaysPerWeek) {
        this.id = id;
        this.setName(name);
        this.participantTypes = participantTypes;
        if (participantTypes.contains(ParticipantType.PLAYER)) {
            this.setPlayerLicense(playerLicense);
            this.playerWorkingDaysPerWeek = playerWorkingDaysPerWeek;
        }
        if (participantTypes.contains(ParticipantType.TRAINER)) {
            this.setTrainerLicense(trainerLicense);
            this.trainerWorkingDaysPerWeek = trainerWorkingDaysPerWeek;
        }
    }

    public boolean isPlayer() {
        if (this.participantTypes.contains(ParticipantType.PLAYER)) {
            return true;
        }
        return false;
    }

    public boolean isTrainer() {
        if (this.participantTypes.contains(ParticipantType.TRAINER)) {
            return true;
        }
        return false;
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
        if (name == null) {
            throw new IllegalArgumentException("Name can't be null!");
        }
        this.name = name;
    }

    public String getPlayerLicense() {
        if (!isPlayer()) {
            throw new IllegalArgumentException("Isn't a player!");
        }
        return playerLicense;
    }

    public void setPlayerLicense(String playerLicense) {
        if (playerLicense == null) {
            throw new IllegalArgumentException("Player license can't be null!");
        }
        if (!isPlayer()) {
            throw new IllegalArgumentException("Isn't a player!");
        }
        this.playerLicense = playerLicense;
    }

    public String getTrainerLicense() {
        if (!isTrainer()) {
            throw new IllegalArgumentException("Isn't a trainer!");
        }
        return trainerLicense;
    }

    public void setTrainerLicense(String trainerLicense) {
        if (trainerLicense == null) {
            throw new IllegalArgumentException("Trainer License can't be null!");
        }
        if (!isTrainer()) {
            throw new IllegalArgumentException("Isn't a trainer!");
        }
        this.trainerLicense = trainerLicense;
    }

    public long getPlayerWorkingDaysPerWeek() {
        return playerWorkingDaysPerWeek;
    }

    public void setPlayerWorkingDaysPerWeek(long playerWorkingDaysPerWeek) {
        if (!isPlayer()) {
            throw new NullPointerException("Isn't a player!");
        }
        this.playerWorkingDaysPerWeek = playerWorkingDaysPerWeek;
    }

    public long getTrainerWorkingDaysPerWeek() {
        return trainerWorkingDaysPerWeek;
    }

    public void setTrainerWorkingDaysPerWeek(long trainerWorkingDaysPerWeek) {
        if (!isTrainer()) {
            throw new NullPointerException("Isn't a trainer!");
        }
        this.trainerWorkingDaysPerWeek = trainerWorkingDaysPerWeek;
    }

    public EnumSet<ParticipantType> getParticipantTypes() {
        EnumSet<ParticipantType> types = this.participantTypes;
        return types;
    }

    public String toString() {
        return getId() + " " + getName() + "\n" + (getPlayerLicense() != null ? getPlayerLicense() : "none") + "\n"
                + (getTrainerLicense() != null ? getTrainerLicense() : "none") + "\n" + getParticipantTypes();
    }

}
