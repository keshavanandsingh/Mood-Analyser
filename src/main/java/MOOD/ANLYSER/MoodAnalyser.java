package MOOD.ANLYSER;
import com.training.InvalidMoodEx.ExceptionType;


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
			if(message.length()==0)
				throw new InvalidMoodEx(InvalidMoodEx.ExceptionType.Entered_Empty, "Enter A Valid Mood !");
			if(message.contains("Sad"))
				return "Sad";
			else
				return "Happy";
			}
			catch(Exception e){
				throw new InvalidMoodEx(InvalidMoodEx.ExceptionType.Entered_Null, "Enter A Valid Mood !");
			}
			
		}
}
