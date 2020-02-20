package com.webcore.app.loan.main.repositary;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webcore.app.loan.main.model.EmiDetails;
@Repository
public interface EmiDeatilsRepositry extends CrudRepository<EmiDetails, Integer> {

}
