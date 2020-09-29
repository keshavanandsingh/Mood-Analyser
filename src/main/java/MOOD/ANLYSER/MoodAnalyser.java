package MOOD.ANLYSER;

public class MoodAnalyser {
	private String message;
	public MoodAnalyser() {
	}
	public MoodAnalyser(String string) {
		this.message=string;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String AnalyseMood() {
			if(message.contains("Sad"))
				return "Sad";
			else
				return "Happy";
			
		}
}
