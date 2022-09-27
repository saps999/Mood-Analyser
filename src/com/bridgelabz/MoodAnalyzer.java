package com.bridgelabz;

public class MoodAnalyzer {
    String message;
    public MoodAnalyzer(String message) {
        this.message=message;
    }

    public static String analyseMood(String message) {
        try {
            message.contains("sad");
            System.out.println("SAD");
            return "SAD MOOD";
        }
        catch (NullPointerException e){
            System.out.println("HAPPY");
            return "HAPPY MOOD";
        }
    }
    public void analyse(){
        MoodAnalyzer.analyseMood(message);
    }

    public static void main(String[] args) {
       new MoodAnalyzer("I am in sad mood").analyse();
    }
}
