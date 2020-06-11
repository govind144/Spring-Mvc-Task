package com.gkn.springmvctask;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


public class Band {
	

	
	private String band;

   private LinkedHashMap<ArrayList<String>,String> bandOps;
	public Band() {
		
		
		
		ArrayList<String>member1=new ArrayList<String>();
		member1.add("Ben Campbell\n");
		member1.add("\nBeth Campbell");
		
		ArrayList<String>member2=new ArrayList<String>();
		member2.add("Ayudhaya\n");
		member2.add("\nNattha");
		
		ArrayList<String>member3=new ArrayList<String>();
		member3.add("David Saunders\n");
		member3.add("\nDavid Mitchell");
		
		ArrayList<String>member4=new ArrayList<String>();
		member4.add("Kerrry Gordy\n");
		member4.add("\nBenny Medina");

	bandOps=new LinkedHashMap<ArrayList<String>, String>();
	bandOps.put(member1,"Atlas");
	bandOps.put(member2,"Paradox");
	bandOps.put(member3,"The 3Ds");
	bandOps.put(member4,"Apollo");

	}
	public void setBandOps(LinkedHashMap<ArrayList<String>, String> bandOps) {
		this.bandOps = bandOps;
	}


	public String getBand() {
		return band;
	}

	public void setBand(String band) {
		this.band = band;
	}

	public LinkedHashMap<ArrayList<String>, String> getBandOps() {
		return bandOps;
	}
}
