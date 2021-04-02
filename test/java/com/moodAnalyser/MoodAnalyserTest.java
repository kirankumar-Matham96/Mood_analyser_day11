package com.moodAnalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest
{
    @Test
    public void givenSad_returnSad() throws MoodInvalidException
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
        String mood = MoodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY",mood);
    }
}
