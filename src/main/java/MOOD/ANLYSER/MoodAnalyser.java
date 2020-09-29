package MOOD.ANLYSER;

public class MoodAnalyser
{
	private String message;
	public MoodAnalyser() {
	}
	public MoodAnalyser(String string) {
		this.message=string;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String AnalyseMood() throws InvalidMoodEx {
			try {
			if(message.contains("Sad"))
				return "Sad";
			else
				return "Happy";
			}
			catch(Exception e){
				throw new InvalidMoodEx("Enter A Valid Mood");
			}
			
		}
	
}
