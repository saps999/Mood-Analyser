package com.bridgelabz;

public class MoodAnalyzer {
    String message;

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public static String analyseMood(String message) {
        try {
            message.contains(null);
            System.out.println("HAPPY");
            return "HAPPY MOOD";

        } catch (NullPointerException e) {
            System.out.println("SAD");
            return "SAD MOOD";
        }
    }

    public void analyse() {
        MoodAnalyzer.analyseMood(message);
    }

    public static void main(String[] args) {
        new MoodAnalyzer("").analyse();
    }
}
