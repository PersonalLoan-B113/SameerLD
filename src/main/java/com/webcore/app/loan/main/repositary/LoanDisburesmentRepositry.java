package com.webcore.app.loan.main.repositary;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webcore.app.loan.main.model.LoanDisbursmentDetails;
@Repository
public interface LoanDisburesmentRepositry extends CrudRepository<LoanDisbursmentDetails, Integer> {

}
