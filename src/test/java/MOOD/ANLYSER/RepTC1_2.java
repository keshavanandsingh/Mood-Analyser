package MOOD.ANLYSER;

import org.junit.Assert;

import org.junit.Test;

public class RepTC1_2 {
	//Happy
		@Test
		public void WhenGivenHappy_ReturnsHappy() {
			MoodAnalyser moodAnalyser=new MoodAnalyser();
			moodAnalyser.setMessage("Happy");
			String mood=moodAnalyser.AnalyseMood();
			Assert.assertEquals("Happy",mood);
		}
	//Sad
		@Test
		public void WhenGivenSad_ReturnsSad() {
			MoodAnalyser moodAnalyser=new MoodAnalyser();
			moodAnalyser.setMessage("Sad");
			String mood=moodAnalyser.AnalyseMood();
			Assert.assertEquals("Sad",mood);
		}
		@Test
		public void WhenGivenSadMessage_ReturnsSad() {
			MoodAnalyser moodAnalyser=new MoodAnalyser();
			moodAnalyser.setMessage("I am in Sad mood");
			String mood=moodAnalyser.AnalyseMood();
			Assert.assertEquals("Sad",mood);
		}
		@Test
		public void WhenGivenHappyMessage_ReturnsHappy() {
			MoodAnalyser moodAnalyser=new MoodAnalyser();
			moodAnalyser.setMessage("I am in Happy mood");
			String mood=moodAnalyser.AnalyseMood();
			Assert.assertEquals("Happy",mood);
		}
}
