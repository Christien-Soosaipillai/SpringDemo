package com.christien.annotations;

import org.springframework.beans.factory.annotation.Autowired;

public class License {
	
	private Tag tag;
	private Level level;
	
	
	public Tag getTag() {
		return tag;
	}
	
	@Autowired
	public void setTag(Tag tag) {
		this.tag = tag;
	}
	
	public Level getLevel() {
		return level;
	}
	
	public void setLevel(Level level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "License [tag=" + tag + ", level=" + level + "]";
	}
	
}
