package com.moodAnalyser;

public class MoodInvalidException extends Exception
{
    //exception types
    enum ExceptionType
    {
        ENTERED_NULL, ENTERED_EMPTY
    }
    ExceptionType type;

    //method to show exception
    public MoodInvalidException(ExceptionType type, String message)
    {
        super(message);
        this.type = type;
    }
}
