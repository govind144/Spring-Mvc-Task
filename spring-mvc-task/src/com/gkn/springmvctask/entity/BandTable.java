package com.gkn.springmvctask.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="band_details")
public class BandTable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="band_id")
	private String id;
	@Column(name="band_name")
	private String bname;
	@Column(name="band_member")
	private String bmember;
	
	public BandTable() {
		
	}
	public BandTable(String id, String bname, String bmember) {
		super();
		this.id = id;
		this.bname = bname;
		this.bmember = bmember;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBmember() {
		return bmember;
	}
	public void setBmember(String bmember) {
		this.bmember = bmember;
	}
	
	
	@Override
	public String toString() {
		return "BandTable [id=" + id + ", bname=" + bname + ", bmember=" + bmember + "]";
	}

}
