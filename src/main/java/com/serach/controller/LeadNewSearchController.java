package com.serach.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.serach.dto.LeadSearchDto;

@Controller
public class LeadNewSearchController {
	//http://localhost:9090/searchPage
	@RequestMapping("/searchPage")
	public String searchLead() {
		return "search_lead";
	}
	
	@Autowired
	private LeadSearchRestController restClient;
	
	//http://localhost:9090/serach
	@RequestMapping("/serach")
	public String search(@RequestParam("id") long id,Model model) {
//		System.out.println(id);
		LeadSearchDto lead = restClient.getLead(id);
		model.addAttribute("getId", lead);
		return "get_lead";
	}
}
