package com.bridgelabz.moodanalyser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.hamcrest.CoreMatchers;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;

public class MoodAnalyserTest {
	
	@Test
	public void  givenMessage_WhenSad_ShouldReturnSad() {
		MoodAnalyser moodAnalyzer = new MoodAnalyser("This is a sad message");
		String mood = moodAnalyzer.analyseMood();
		Assert.assertEquals("SAD",mood);
	}
	
	
	@Test
	public void  givenMessage_WhenHappy_ShouldReturnHappy() {
		MoodAnalyser moodAnalyzer = new MoodAnalyser("This is a happy message");
		String mood = moodAnalyzer.analyseMood();
		Assert.assertEquals("HAPPY",mood);
	}
	
	@Test
	public void givenMessage_WhenNull_ShouldReturnHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser(null);
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("HAPPY", mood);
	}
}