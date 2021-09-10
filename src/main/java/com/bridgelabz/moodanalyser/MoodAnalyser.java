package com.bridgelabz.moodanalyser;
 

public class MoodAnalyser {
    public String message;
	
	public MoodAnalyser(String message){
		this.message = message;
	}
	
	public MoodAnalyser() {
		
	}
    public String analyseMood()throws MoodAnalysisException {

    	try {
    		 if (message.length() == 0){
                 throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_EMPTY, "Please enter a proper message");
             }
			 if (message.contains(("sad"))) {
				return "SAD";
		 	 } else {
				return "HAPPY";
			 }
		 } catch (NullPointerException e) {
			 throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_NULL, "Please enter a proper message");
		}
    }
} 
