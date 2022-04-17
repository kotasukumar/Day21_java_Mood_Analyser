package com.company;

public class MoodAnalyserException extends Exception{
    enum Display {HAPPY , SAD, IT_IS_NULL, IT_IS_EMPTY, INVALID_INPUT}

    String display;
    public MoodAnalyserException( String m){
//        super(String.valueOf(message));
        super(m);
    }
}
