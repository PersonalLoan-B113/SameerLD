package com.webcore.app.loan.main.repositary;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webcore.app.loan.main.model.LedgerDetails;
@Repository
public interface LedgerDetailsRepositry extends CrudRepository<LedgerDetails, Integer> {

}
