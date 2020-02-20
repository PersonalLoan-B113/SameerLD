package com.webcore.app.loan.main.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcore.app.loan.main.model.EmiDetails;
import com.webcore.app.loan.main.repositary.EmiDeatilsRepositry;

@Service
public class DisburesementServiceImplement implements DisburesementServiceInterface {
	@Autowired
	EmiDeatilsRepositry edr;

	@Override
	public EmiDetails savedata(EmiDetails em) {
		// TODO Auto-generated method stub
		return edr.save(em);
	}

}
