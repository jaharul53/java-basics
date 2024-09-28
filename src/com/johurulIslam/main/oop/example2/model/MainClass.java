package com.johurulIslam.main.oop.example2.model;

public class MainClass {
    public static void main(String[] args) {
//        CsGo csGo1= new CsGo("Johurul", 0);
//        csGo1.playerScore++;
//        csGo1.playerScore++;
//        csGo1.playerScore++;


        CsGo haker=new CsGo("Mr. Haker", 0);
        haker.addKillCount();
        haker.addKillCount();
        haker.addKillCount();
        haker.printStats();
    }
}
