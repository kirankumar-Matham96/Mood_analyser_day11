package com.moodAnalyser;

public class MoodAnalyser
{
    static String message;

    //constructor with no parameters
    public MoodAnalyser()
    {
        message = "SAD";
    }

    //constructor with parameters
    public MoodAnalyser(String message)
    {
        this.message = message;
    }

    //method to check message
    public String analyseMood()
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
        if(moodAnalyser.message.contains("I am in Sad Mood"))
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
        String s = moodAnalyser.analyseMood();
    }
}
