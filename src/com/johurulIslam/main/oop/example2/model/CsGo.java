package com.johurulIslam.main.oop.example2.model;

public class CsGo {
    public String playerName;
    private Integer playerScore;

    public CsGo(String playerName, Integer playerScore) {
        this.playerName = playerName;
        this.playerScore = playerScore ;
    }
    public void addKillCount(){
        playerScore++;
    }
    public void printStats(){
        System.out.println("Player Name: " + playerName);
        System.out.println("Player Score: " + playerScore);
    }
}
