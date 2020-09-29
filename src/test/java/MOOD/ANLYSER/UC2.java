package MOOD.ANLYSER;

import org.junit.Assert;
import org.junit.Test;

public class UC2 {
	//Happy MOOD.ANLYSER
		@Test
		public void WhenGivenHappy_ReturnsHappy() {
			MoodAnalyser moodAnalyser=new MoodAnalyser();
			moodAnalyser.setMessage("Happy");
			try {
				String mood = moodAnalyser.AnalyseMood();
				Assert.assertEquals("Happy",mood);
			} catch (InvalidMoodEx e) {
			Assert.assertEquals("how is your mood",e.getMessage());
			}
		}
	//Sad MOOD.ANLYSER
		@Test
		public void WhenGivenSad_ReturnsSad() {
			MoodAnalyser moodAnalyser=new MoodAnalyser();
			moodAnalyser.setMessage("Sad");
			try {
				String mood = moodAnalyser.AnalyseMood();
				Assert.assertEquals("Sad",mood);
			} catch (InvalidMoodEx e) {
			Assert.assertEquals("how is your mood",e.getMessage());
			}
		}
		@Test
		public void WhenGivenSadMessage_ReturnsSad() {
			MoodAnalyser moodAnalyser=new MoodAnalyser();
			moodAnalyser.setMessage("I am in Sad Mood");
			try {
				String mood = moodAnalyser.AnalyseMood();
				Assert.assertEquals("Sad",mood);
			} catch (InvalidMoodEx e) {
			Assert.assertEquals("how is your mood",e.getMessage());
			}
		}
		@Test
		public void WhenGivenHappyMessage_ReturnsHappy() {
			MoodAnalyser moodAnalyser=new MoodAnalyser();
			moodAnalyser.setMessage("I am in Happy Mood");
			try {
				String mood = moodAnalyser.AnalyseMood();
				Assert.assertEquals("Happy",mood);
			} catch (InvalidMoodEx e) {
			Assert.assertEquals("how is your mood",e.getMessage());
			}
		}
	
	}

