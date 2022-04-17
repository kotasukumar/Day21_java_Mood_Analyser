package com.company;

import org.junit.jupiter.api.Test;

class MoodAnalyserTest {
//    MoodAnalyser moodAnalyser = new MoodAnalyser();
//    MoodAnalyser moodAnalyser1 = new MoodAnalyser("I am in Any Mood");

    @Test
    void givenMessage_ContainSad_ReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        boolean result = moodAnalyser.analyseMood("I am in Sad Mood");
        if(result == true){
            System.out.println(MoodAnalyserException.Display.SAD);
        }
        else {
            System.out.println(MoodAnalyserException.Display.HAPPY);
        }
    }

    @Test
    void givenMessage_NotContainSad_Return_Happy() {
        MoodAnalyser moodAnalyser1 = new MoodAnalyser("I am in Any Mood");
        boolean result = moodAnalyser1.analyseMood("I am in Any Mood");
        if(result == true){
            System.out.println(MoodAnalyserException.Display.SAD);
        }
        else {
            System.out.println(MoodAnalyserException.Display.HAPPY);
        }
    }

    @Test
    void givenMassage_ContainNull_ReturnHappy() {
        MoodAnalyser moodAnalyser1 = new MoodAnalyser();
        boolean result = moodAnalyser1.analyseMood1("");
        if(result == true){
            System.out.println(MoodAnalyserException.Display.SAD);
        }
        else {
            System.out.println(MoodAnalyserException.Display.HAPPY);
        }
    }

    @Test
    void givenMessage_containNull_ReturnCustomException () throws MoodAnalyserException {
        MoodAnalyser moodAnalyser1 = new MoodAnalyser();
//        boolean result = moodAnalyser1.analyseMood1();
        try{
            moodAnalyser1.analyseMood1(null);
        }catch (NullPointerException e){
            throw new MoodAnalyserException("Null please enter valid input");
        }
    }
}