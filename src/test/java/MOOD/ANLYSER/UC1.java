package MOOD.ANLYSER;

import org.junit.Assert;
import org.junit.Test;

public class UC1
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
	
	}


