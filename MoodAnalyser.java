package com.company;

public class MoodAnalyser {
//    enum display {HAPPY , SAD, IT_IS_NULL, IT_IS_EMPTY, INVALID_INPUT}
    String message;

    public MoodAnalyser(){
    }
    public MoodAnalyser(String message) {
        this.message = message;
    }

    public boolean analyseMood(String message){
        return message.contains("Sad");
    }

    public boolean analyseMood1(String message){
        return message.equals(null);
    }
}
