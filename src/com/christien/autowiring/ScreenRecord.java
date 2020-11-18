package com.christien.autowiring;

public class ScreenRecord {

	public ScreenRecord() {
		System.out.println("Initializing services....");
	}
	
	public void beginRecording() {
		System.out.println("Recording...");
	}
	
	public void stopRecording() {
		System.out.println("Stop Recording...");
	}
	
}
