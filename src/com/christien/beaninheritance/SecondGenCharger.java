package com.christien.beaninheritance;

public class SecondGenCharger {

	private String body;
	private Integer speed;
	private boolean superChargedOption;
	
	public SecondGenCharger() {}
	
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
	
	public boolean isSuperChargedOption() {
		return superChargedOption;
	}

	public void setSuperChargedOption(boolean superChargedOption) {
		this.superChargedOption = superChargedOption;
	}

	public void getCarReciept() {
		if(superChargedOption) {
			System.out.println( "FirstGenCharger [body=" + body + ", speed=" + speed + ", Super Charged=" + superChargedOption +  "]");
		}
	}
	
	
}
