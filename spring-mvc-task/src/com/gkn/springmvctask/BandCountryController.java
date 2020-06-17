package com.gkn.springmvctask;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gkn.springmvctask.dao.BandDao;
import com.gkn.springmvctask.entity.BandCountry;

@Controller
@RequestMapping("/banddetails")
public class BandCountryController {
	@Autowired
	private BandDao bandCountryDAO;
	
	
	@RequestMapping("/list")
	public String listCustomers(Model theModel) {
		
		
		List<BandCountry> theBandDetails = bandCountryDAO.getBandDetail();
		
		theModel.addAttribute("bandDetails", theBandDetails);
		
		return "list";
	}
	@RequestMapping("/showFormAdd")
	public String showFormAdd(Model model)
	{
		BandCountry theBandCo = new BandCountry();
		
		model.addAttribute("bandForm", theBandCo);
		
		
		return "newform";
	}
	@PostMapping("/savedata")
	public String saveData(@ModelAttribute("bandForm") BandCountry theBandCo)
	
	{
		bandCountryDAO.saveData(theBandCo);
		
		return "redirect:/banddetails/list";
	}
	

}
