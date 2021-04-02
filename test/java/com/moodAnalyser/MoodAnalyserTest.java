package com.moodAnalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest
{
    @Test
    public void givenSad_returnSad()
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("SAD",mood);
    }
}
