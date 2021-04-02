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
        MoodAnalyser.message = message;
    }

    //method to check message
    public static String analyseMood() throws MoodInvalidException
    {
        try
        {
            if(MoodAnalyser.message.length() == 0)
            {
                throw new MoodInvalidException(MoodInvalidException.ExceptionType.ENTERED_EMPTY, "Please enter valid message!");
            }

            if (MoodAnalyser.message.contains("SAD")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        }
        catch(NullPointerException | MoodInvalidException npe)
        {
            throw new MoodInvalidException(MoodInvalidException.ExceptionType.ENTERED_NULL, "Please enter valid message!");
        }
    }

    public static void main(String[] args) throws MoodInvalidException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
        String s = moodAnalyser.analyseMood();
    }
}
