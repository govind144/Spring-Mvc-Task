package com.gkn.springmvctask;

import java.util.ArrayList;


public class Student {
	private String name;
	private String band;
	private ArrayList<String> bandOps;
	public Student() {
		bandOps=new ArrayList<String>();
		
	bandOps.add("Atlas");
	bandOps.add("Paradox");
	bandOps.add("Bloom");
	bandOps.add("Apollo");

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBand() {
		return band;
	}

	public void setBand(String band) {
		this.band = band;
	}

	public ArrayList<String> getBandOps() {
		return bandOps;
	}

	


}
