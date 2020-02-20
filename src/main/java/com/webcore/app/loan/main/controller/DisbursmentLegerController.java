package com.webcore.app.loan.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.webcore.app.loan.main.model.EmiDetails;
import com.webcore.app.loan.main.model.service.DisburesementServiceInterface;

@RestController
public class DisbursmentLegerController {
	@Autowired
	DisburesementServiceInterface dsi;
	
	@PostMapping(value = "/reg")
	public EmiDetails registdata(@RequestBody EmiDetails em)
	{
		EmiDetails ed=dsi.savedata(em);
		
		return ed;
		
	}

}
