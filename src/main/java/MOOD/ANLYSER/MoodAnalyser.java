package MOOD.ANLYSER;

public class MoodAnalyser 
{
	private String message;
	public MoodAnalyser() {}
		public String AnalyseMood(String string) {
			if(string.contains("Sad"))
				return "Sad";
			else if(string.contains("Happy"))
				return "Happy";
			else
				return "Happy";
			
		}
}
