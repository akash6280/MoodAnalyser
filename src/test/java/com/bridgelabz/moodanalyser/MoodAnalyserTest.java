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
	public void analyzeMood_SadMessage_SAD() throws Exception {
		MoodAnalyser moodAnalyzer = new MoodAnalyser();
		String mood = moodAnalyzer.analyseMood("This is a sad message");
		Assert.assertThat(mood, CoreMatchers.is("SAD"));
	}
}