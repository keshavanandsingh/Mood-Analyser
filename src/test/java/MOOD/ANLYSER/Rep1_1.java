package MOOD.ANLYSER;

import org.junit.Assert;
import org.junit.Test;

public class Rep1_1 {
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

}
