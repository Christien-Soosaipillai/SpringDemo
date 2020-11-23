package com.christien.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Archer {

	private String name;
	
	@Autowired
	@Qualifier("bow2")
	private Bow bow;
	
	private MemberType memberType;


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Bow getBow() {
		return bow;
	}
	
	public void setBow(Bow bow) {
		this.bow = bow;
	}

	public MemberType getMemberType() {
		return memberType;
	}


	public void setMemberType(MemberType memberType) {
		this.memberType = memberType;
	}


	@Override
	public String toString() {
		return "Archer [name=" + name + ", bow=" + bow + ", memberType=" + memberType + "]";
	}
	
	
}
