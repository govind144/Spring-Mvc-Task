package com.gkn.springmvctask.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="country")
public class BandCountry {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;

	@Column(name="band_country")
	private String country;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="band_id")
	private BandTable bandTable;
	
	public BandCountry()
	{
		
	}

	public BandCountry(String country) {
		super();
		this.country = country;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public BandTable getBandTable() {
		return bandTable;
	}

	public void setBandTable(BandTable bandTable) {
		this.bandTable = bandTable;
	}

	@Override
	public String toString() {
		return "BandCountry [id=" + id + ", country=" + country + ", bandTable=" + bandTable + "]";
	}
	

}
