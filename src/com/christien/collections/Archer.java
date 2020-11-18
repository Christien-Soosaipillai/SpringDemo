package com.christien.collections;

public class Archer {

	private String name;
	private String bow;
	private MemberType memberType;
	
	
	public Archer(String name, String bow, MemberType memberType) {	
		this.name = name;
		this.bow = bow;
		this.memberType = memberType;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getBow() {
		return bow;
	}


	public void setBow(String bow) {
		this.bow = bow;
	}


	public MemberType getMemberType() {
		return memberType;
	}


	public void setMemberType(MemberType memberType) {
		this.memberType = memberType;
	}
	
	
	
	
	
	
}
