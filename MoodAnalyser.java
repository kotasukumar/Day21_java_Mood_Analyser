package com.company;

public class MoodAnalyser {
    enum display {HAPPY , SAD}

    public boolean analyseMood(String message){
        return message.contains("Sad");
    }
}
