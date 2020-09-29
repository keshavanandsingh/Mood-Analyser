package MOOD.ANLYSER;

import org.junit.Assert;
import org.junit.Test;

public class TC1_1 
{
	//Happy
		@Test
		public void WhenGivenHappy_ReturnsHappy() {
			MoodAnalyser moodAnalyser=new MoodAnalyser();
			String mood=moodAnalyser.AnalyseMood("Happy");
			Assert.assertEquals("Happy",mood);
		}
	//Sad
		@Test
		public void WhenGivenSad_ReturnsSad() {
			MoodAnalyser moodAnalyser=new MoodAnalyser();
			String mood=moodAnalyser.AnalyseMood("Sad");
			Assert.assertEquals("Sad",mood);
		}
		@Test
		public void WhenGivenSadMessage_ReturnsSad() {
			MoodAnalyser moodAnalyser=new MoodAnalyser();
			String mood=moodAnalyser.AnalyseMood("I am in Sad mood !");
			Assert.assertEquals("Sad",mood);
		}
	

}
