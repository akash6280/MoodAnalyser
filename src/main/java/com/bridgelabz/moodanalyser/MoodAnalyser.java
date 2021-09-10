package com.bridgelabz.moodanalyser;
 

public class MoodAnalyser {
    public String message;
	
	public MoodAnalyser(String message){
		this.message = message;
	}
	
	public MoodAnalyser() {
		this.message = "";
	}
    public String analyseMood() {

        if (message.contains("sad")) {
        	return "SAD";
        } 
        else {
        	return "HAPPY";
        }
    }
} 
