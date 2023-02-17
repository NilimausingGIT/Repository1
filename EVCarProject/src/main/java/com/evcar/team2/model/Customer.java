package com.evcar.team2.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cId;
	@OneToOne(cascade = CascadeType.ALL)
	private Cibil cibil;
	@OneToOne(cascade = CascadeType.ALL)
	private CurrentLoanDetails currentloandetails;
	@OneToOne(cascade = CascadeType.ALL)
	private CustomerVerification customerverification;
	@OneToOne(cascade = CascadeType.ALL)
	private PreviousLoanBank previousloanbank;
	@OneToOne(cascade = CascadeType.ALL)
	private Profession profession;

	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public Cibil getCibil() {
		return cibil;
	}
	public void setCibil(Cibil cibil) {
		this.cibil = cibil;
	}
	public CurrentLoanDetails getCurrentloandetails() {
		return currentloandetails;
	}
	public void setCurrentloandetails(CurrentLoanDetails currentloandetails) {
		this.currentloandetails = currentloandetails;
	}
	public CustomerVerification getCustomerverification() {
		return customerverification;
	}
	public void setCustomerverification(CustomerVerification customerverification) {
		this.customerverification = customerverification;
	}

	public PreviousLoanBank getPreviousloanbank() {
		return previousloanbank;
	}
	public void setPreviousloanbank(PreviousLoanBank previousloanbank) {
		this.previousloanbank = previousloanbank;
	}


	public Profession getProfession() {
		return profession;
	}
	public void setProfession(Profession profession) {
		this.profession = profession;
	}
	
	
//	@OneToOne(cascade = CascadeType.ALL)
//	private EmiDetail emidetails;
//	@OneToOne(cascade = CascadeType.ALL)
//	private LoanDisbursement loandisbursment;
	
//	@OneToOne(cascade = CascadeType.ALL)
//	private PreviousLoanDetails previousloandetails;
//	@OneToOne(cascade = CascadeType.ALL)
//	private SanctionLetter sanctionletter;
	
	
//	public EmiDetail getEmidetails() {
//	return emidetails;
//}
//public void setEmidetails(EmiDetail emidetails) {
//	this.emidetails = emidetails;
//}
//public LoanDisbursement getLoandisbursment() {
//	return loandisbursment;
//}
//public void setLoandisbursment(LoanDisbursement loandisbursment) {
//	this.loandisbursment = loandisbursment;
//}
	
//	public PreviousLoanDetails getPreviousloandetails() {
//	return previousloandetails;
//}
//public void setPreviousloandetails(PreviousLoanDetails previousloandetails) {
//	this.previousloandetails = previousloandetails;
//}
//public SanctionLetter getSanctionletter() {
//	return sanctionletter;
//}
//public void setSanctionletter(SanctionLetter sanctionletter) {
//	this.sanctionletter = sanctionletter;
//}
}
