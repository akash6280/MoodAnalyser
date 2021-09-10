package com.bridgelabz.moodanalyser;
 

public class MoodAnalyser {
    public String message;
	
	public MoodAnalyser(String message){
		this.message = message;
	}
	
	public MoodAnalyser() {
		
	}
    public String analyseMood() {

    	try {
			if (message.contains(("sad"))) {
				return "SAD";
			} else {
				return "HAPPY";
			}
		} catch (NullPointerException e) {
			return "HAPPY";
		}
    }
} 
