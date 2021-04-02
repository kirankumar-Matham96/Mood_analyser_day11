package com.moodAnalyser;

public class MoodAnalyser
{
    public String alyseMood(String message)
    {
        if(message.contains("SAD"))
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
        String mood = "SAD";
        String s = moodAnalyser.alyseMood(mood);
    }
}
