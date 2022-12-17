package com.branko.game.domain;

public class Statistics {
    private int playerAwins;
    private int playerBwins;
    private int draws;
    private int numberOfRounds;

    public Statistics(int playerAwins, int playerBwins, int draws, int numberOfRounds) {
        this.playerAwins = playerAwins;
        this.playerBwins = playerBwins;
        this.draws = draws;
        this.numberOfRounds = numberOfRounds;
    }

    public int getPlayerAwins() {
        return playerAwins;
    }

    public void setPlayerAwins(int playerAwins) {
        this.playerAwins = playerAwins;
    }

    public int getPlayerBwins() {
        return playerBwins;
    }

    public void setPlayerBwins(int playerBwins) {
        this.playerBwins = playerBwins;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    public int getNumberOfRounds() {
        return numberOfRounds;
    }

    public void setNumberOfRounds(int numberOfRounds) {
        this.numberOfRounds = numberOfRounds;
    }
}
