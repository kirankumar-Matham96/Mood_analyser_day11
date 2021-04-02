package com.moodAnalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest
{
    @Test
    public void givenIAmInSadMood_returnSad()
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.alyseMood("I am in Sad Mood");
        Assert.assertEquals("SAD",mood);
    }

    @Test
    public void givenIAmInAnyMood_returnHappy()
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.alyseMood("I am In Any Mood");
        Assert.assertEquals("HAPPY",mood);
    }
}
