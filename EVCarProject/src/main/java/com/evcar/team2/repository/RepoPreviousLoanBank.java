package com.evcar.team2.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.evcar.team2.model.PreviousLoanBank;

@Repository
public interface RepoPreviousLoanBank extends CrudRepository<PreviousLoanBank, Integer>{

}
