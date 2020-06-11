package com.gkn.springmvctask;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gkn.springmvctask.Band;

@Controller
@RequestMapping("/band")
public class BandController {
	@RequestMapping("/showForm")
	public String showForm(Model model)
	{
		Band theBand = new Band();
		
		model.addAttribute("band", theBand);
		
		return "band-form";
	}
	@RequestMapping("/bandform")
	public String stuForm(@ModelAttribute("band") Band
			theBand
			 )
	{
		return "bandconfirm";
	}
	

}
