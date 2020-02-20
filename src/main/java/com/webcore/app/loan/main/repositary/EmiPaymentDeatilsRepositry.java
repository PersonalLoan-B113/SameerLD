package com.webcore.app.loan.main.repositary;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;

import com.webcore.app.loan.main.model.EmiPaymentDetails;
@Controller
public interface EmiPaymentDeatilsRepositry extends CrudRepository<EmiPaymentDetails, Integer>{

}
