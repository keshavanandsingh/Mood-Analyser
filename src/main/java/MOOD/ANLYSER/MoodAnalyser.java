package MOOD.ANLYSER;
import MOOD.ANLYSER.InvalidMoodEx.ExceptionType;

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
	public String AnalyseMood() throws InvalidMoodEx {
			try {
				if(message.length()==0)
					throw new InvalidMoodEx(ExceptionType.Entered_Empty, "Enter A Valid Mood !");
				else if(message.contains("Sad")) 
				return "Sad";
			    else
				return "Happy";
			}
			catch(NullPointerException e) {
				throw new InvalidMoodEx(ExceptionType.Entered_Null,"Enter A Valid Mood !");
			}
			
		}

}
