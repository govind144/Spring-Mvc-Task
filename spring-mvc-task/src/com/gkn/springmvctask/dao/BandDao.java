package com.gkn.springmvctask.dao;

import java.util.List;

import com.gkn.springmvctask.entity.BandCountry;
import com.gkn.springmvctask.entity.BandTable;


public interface BandDao {

	List<BandTable> getBandDetails();

	void saveData(BandCountry theBandCo);

	List<BandCountry> getBandDetail();

}
