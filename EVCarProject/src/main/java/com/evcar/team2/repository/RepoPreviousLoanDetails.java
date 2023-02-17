package com.evcar.team2.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.evcar.team2.model.PreviousLoanDetails;

@Repository
public interface RepoPreviousLoanDetails extends CrudRepository<PreviousLoanDetails, Integer>{

}
