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
	public void  givenMessage_WhenSad_ShouldReturnSad() throws Exception {
		MoodAnalyser moodAnalyzer = new MoodAnalyser("This is a sad message");
		String mood = moodAnalyzer.analyseMood();
		Assert.assertEquals("SAD",mood);
	}
	
	
	@Test
	public void  givenMessage_WhenHappy_ShouldReturnHappy() throws Exception {
		MoodAnalyser moodAnalyzer = new MoodAnalyser("This is a happy message");
		String mood = moodAnalyzer.analyseMood();
		Assert.assertEquals("HAPPY",mood);
	}
	
	@Test
	public void givenMessage_WhenNull_ShouldThrowException() {
		MoodAnalyser moodAnalyser = new MoodAnalyser(null);
		try {
			moodAnalyser.analyseMood();
		} catch (MoodAnalysisException e) {
			Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL, e.type);
		}
	}
	@Test
	public void givenMessage_WhenEmpty_ShouldThrowException() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("");
		try {
			moodAnalyser.analyseMood();
		} catch (MoodAnalysisException e) {
			Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_EMPTY, e.type);
		}
	}
	
}