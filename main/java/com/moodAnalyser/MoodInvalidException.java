package com.moodAnalyser;

public class MoodInvalidException extends Exception
{
    enum ExceptionType
    {
        ENTERED_NULL, ENTERED_EMPTY
    }
    ExceptionType type;
    public MoodInvalidException(ExceptionType type, String message)
    {
        super(message);
        this.type = type;
    }
}
