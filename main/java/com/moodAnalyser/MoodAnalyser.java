package com.moodAnalyser;

public class MoodAnalyser
{
    public String alyseMood(String message)
    {
        if(message.contains("I am in Sad Mood"))
        {
            return "SAD";
        }
        else
        {
            return "HAPPY";
        }
    }

    public static void main(String[] args)
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = "I am in Sad Mood";
        String s = moodAnalyser.alyseMood(mood);
    }
}
