package com.gkn.springmvctask;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gkn.springmvctask.dao.BandDao;
import com.gkn.springmvctask.entity.BandTable;
@Controller
@RequestMapping("/bands")
public class BandTableController {
	@Autowired
	private BandDao bandDao;
	
	
	@RequestMapping("/list")
	public String bandList(Model theModel) {
		
		
		List<BandTable> theBandDetails = bandDao.getBandDetails();
		
		theModel.addAttribute("bandDetails", theBandDetails);
		
		return "band-list";
	}


}
