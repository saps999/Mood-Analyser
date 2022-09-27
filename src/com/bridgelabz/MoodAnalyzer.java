package com.bridgelabz;

public class MoodAnalyzer {
    public String analyseMood(String message) {
        if (message.contains("sad")) {
            System.out.println("SAD");
            return "SAD MOOD";
        } else {
            System.out.println("HAPPY");
            return "HAPPY MOOD";
        }
    }

    public static void main(String[] args) {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer();
        moodAnalyser.analyseMood("I'm in any mood today");
    }
}
