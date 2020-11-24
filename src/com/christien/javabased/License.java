package com.christien.javabased;

public class License {
	
	private Tag tag;
	private Level level;
	
	public License(Tag tag, Level level) {
		this.tag = tag;
		this.level = level;
	}

	public Tag getTag() {
		return tag;
	}
	
	
	public void setTag(Tag tag) {
		this.tag = tag;
	}
	
	public Level getLevel() {
		return level;
	}
	
	public void setLevel(Level level) {
		this.level = level;
	}
	
	
	public void init() {
		System.out.println("Initialization protocol....");
	}
	public void cleanup() {
		System.out.println("Destroying License....");
	}

	@Override
	public String toString() {
		return "License [tag=" + tag + ", level=" + level + "]";
	}
	
}
