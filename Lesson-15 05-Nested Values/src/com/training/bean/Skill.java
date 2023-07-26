package com.training.bean;

public class Skill {
	
	String skillName;
	int ratingOutOf10;
	public Skill(String skillName, int ratingOutOf10) {
		super();
		this.skillName = skillName;
		this.ratingOutOf10 = ratingOutOf10;
	}
	public Skill() {
		super();
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	public int getRatingOutOf10() {
		return ratingOutOf10;
	}
	public void setRatingOutOf10(int ratingOutOf10) {
		this.ratingOutOf10 = ratingOutOf10;
	}
	@Override
	public String toString() {
		return "\n Skill [skillName=" + skillName + ", ratingOutOf10=" + ratingOutOf10 + "]";
	}
	
	
	
	

}
