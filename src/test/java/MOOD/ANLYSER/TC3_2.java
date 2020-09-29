package MOOD.ANLYSER;

import org.junit.Assert;

import org.junit.Test;

public class TC3_2 {
	//Happy
		@Test
		public void WhenGivenHappy_ReturnsHappy() {
			MoodAnalyser moodAnalyser=new MoodAnalyser();
			moodAnalyser.setMessage("Happy");
			try {
				String mood = moodAnalyser.AnalyseMood();
				Assert.assertEquals("Happy",mood);
			} catch (InvalidMoodEx e) {
			Assert.assertEquals("Enter A Valid Mood",e.getMessage());
			}
		}
	//Sad
		@Test
		public void WhenGivenSad_ReturnsSad() {
			MoodAnalyser moodAnalyser=new MoodAnalyser();
			moodAnalyser.setMessage("Sad");
			try {
				String mood = moodAnalyser.AnalyseMood();
				Assert.assertEquals("Sad",mood);
			} catch (InvalidMoodEx e) {
			Assert.assertEquals("Enter A Valid Mood",e.getMessage());
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
			Assert.assertEquals("Enter A Valid Mood",e.getMessage());
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
			Assert.assertEquals("Enter A Valid Mood",e.getMessage());
			}
		}
		@Test
		public void WhenGivenNullMessage_HandlesException_ReturnMessage() {
			MoodAnalyser moodAnalyser=new MoodAnalyser();
			moodAnalyser.setMessage(null);
			try {
				String mood = moodAnalyser.AnalyseMood();
				Assert.assertEquals("Happy",mood);
			} catch (InvalidMoodEx e) {
			Assert.assertEquals("Enter A Valid Mood !",e.getMessage());
			}
		}
		@Test
		public void WhenGivenNullMessage_HandlesException_ReturnInvalidExType() {
			MoodAnalyser moodAnalyser=new MoodAnalyser();
			moodAnalyser.setMessage(null);
			try {
				String mood = moodAnalyser.AnalyseMood();
				Assert.assertEquals("Happy",mood);
			} catch (InvalidMoodEx e) {
			Assert.assertEquals(InvalidMoodEx.ExceptionType.Entered_Null,e.type);
			}
		}
		@Test
		public void WhenGivenEmptyMessage_HandlesException_ReturnInvalidExType() {
			MoodAnalyser moodAnalyser=new MoodAnalyser("");
			try {
				String mood = moodAnalyser.AnalyseMood();
				Assert.assertEquals("Happy",mood);
			} catch (InvalidMoodEx e1) {
			Assert.assertEquals(InvalidMoodEx.ExceptionType.Entered_Empty,e1.type);
			
			}
		}

}
