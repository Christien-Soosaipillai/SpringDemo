package com.christien.beaninheritance;

public class FirstGenCharger {

	private String body;
	private Integer speed;
	
	public FirstGenCharger() {}
	
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public Integer getSpeed() {
		return speed;
	}
	public void setSpeed(Integer speed) {
		this.speed = speed;
	}

	public void getCarReciept() {
		System.out.println( "FirstGenCharger [body=" + body + ", speed=" + speed + "]");
	}
	
	
}
