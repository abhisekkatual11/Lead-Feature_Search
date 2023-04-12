package com.serach.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.serach.dto.LeadSearchDto;

@Component
public class LeadSearchRestController {
	public LeadSearchDto getLead(long id) {
		RestTemplate rest=new RestTemplate();
		LeadSearchDto lead = rest.getForObject("http://localhost:8080/api/leads/findById/"+id,LeadSearchDto.class);
		return lead;
	}
}
