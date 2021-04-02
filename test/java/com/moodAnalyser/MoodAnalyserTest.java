package com.moodAnalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest
{
    @Test
    public void testMoodAnalyser()
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.alyseMood("I am in Sad Mood");
        Assert.assertEquals("SAD",mood);
    }
}
