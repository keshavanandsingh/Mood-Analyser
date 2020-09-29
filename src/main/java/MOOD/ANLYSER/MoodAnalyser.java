package MOOD.ANLYSER;

public class MoodAnalyser 
{
	private String message;
	public MoodAnalyser() {}
		public String AnalyseMood(String string) {
			if(string=="Happy")
				return "Happy";
			else
				return "Sad";
			
		}
}
