package com.company;

public class MoodAnalyser {
    enum display {HAPPY , SAD}
    String message;

    public MoodAnalyser(){
    }
    public MoodAnalyser(String message) {
        this.message = message;
    }

    public boolean analyseMood(String message){
        return message.contains("Sad");
    }

    public boolean analyseMood1(){
        return message.contains("Sad");
    }
}
