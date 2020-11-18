package com.christien.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArcheryShop {
	
	
	private Map<String, Archer> membersInfo;
	private List<Bow> bowsForSale;
	private Set<String> sessionTypes;

	public ArcheryShop() {}

	public Map<String, Archer> getMembersInfo() {
		return membersInfo;
	}

	public void setMembersInfo(Map<String, Archer> membersInfo) {
		this.membersInfo = membersInfo;
	}
	
	public List<Bow> getBowsForSale() {
		return bowsForSale;
	}

	public void setBowsForSale(List<Bow> bowsForSale) {
		this.bowsForSale = bowsForSale;
	}
	
	
	public Set<String> getSessionTypes() {
		return sessionTypes;
	}

	public void setSessionTypes(Set<String> sessionTypes) {
		this.sessionTypes = sessionTypes;
	}

	public void listMembers() {
		System.out.println("\nMEMBERS LIST: ");
		for(Map.Entry<String, Archer> member: membersInfo.entrySet()) {
			Archer archer = member.getValue();
			System.out.println("Name: " + archer.getName() + ", Bow: " + archer.getBow() + ", MemberShip: " + archer.getMemberType());
		}
	}
	
	public void viewBowShop(){
		System.out.println("\nBOWS FOR SALE: ");
		for(Bow bow: bowsForSale) {
			System.out.println("Bow: " + bow.getName() + ", Cost: " + bow.getCost());
		}
	}
	
	public void viewSessionTypes() {
		System.out.println("\nSESSION TYPES: ");
		sessionTypes.forEach(type -> {
			System.out.println(type);
		});
	}
	
}
