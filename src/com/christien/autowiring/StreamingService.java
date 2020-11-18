package com.christien.autowiring;

public class StreamingService {

	private ScreenRecord screenRecorder;
	private String serviceName;
	
	public StreamingService(ScreenRecord screenRecorder, String serviceName) {
		this.screenRecorder = screenRecorder;
		this.serviceName = serviceName;
	}

	public ScreenRecord getScreenRecorder() {
		return screenRecorder;
	}
	
	public void setScreenRecord(ScreenRecord screenRecord) {
		this.screenRecorder = screenRecord;
	}
	
	public String getServiceName() {
		return serviceName;
	}
	
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	
	public void startStream() {
		System.out.println("Stream Starting in 3, 2, 1 ...");
		screenRecorder.beginRecording();
	}
	
	public void endStream() {
		System.out.println("Stream ending now...");
		screenRecorder.stopRecording();
	}
	
	
	
}
