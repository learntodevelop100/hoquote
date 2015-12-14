package tcs.bits.hackathon.hoquote.bean;

import org.hibernate.validator.constraints.NotEmpty;

public class PropertyDetailsPO extends HOQAbstractBean{
	
	@NotEmpty
	private String effectiveDate;
	
	@NotEmpty
	private String mortgagePayment;
	
	@NotEmpty
	private String yearOfPurchase;
	
	@NotEmpty
	private String yearBuilt;
	
	@NotEmpty
	private String homeDescription;
	
	@NotEmpty
	private String noOfPeople;
	
	@NotEmpty
	private String nonJuvenile;
	
	@NotEmpty
	private String noOfSmokers;
	
	@NotEmpty
	private String petIndicator;

	public String getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getMortgagePayment() {
		return mortgagePayment;
	}

	public void setMortgagePayment(String mortgagePayment) {
		this.mortgagePayment = mortgagePayment;
	}

	public String getYearOfPurchase() {
		return yearOfPurchase;
	}

	public void setYearOfPurchase(String yearOfPurchase) {
		this.yearOfPurchase = yearOfPurchase;
	}

	public String getYearBuilt() {
		return yearBuilt;
	}

	public void setYearBuilt(String yearBuilt) {
		this.yearBuilt = yearBuilt;
	}

	public String getHomeDescription() {
		return homeDescription;
	}

	public void setHomeDescription(String homeDescription) {
		this.homeDescription = homeDescription;
	}

	public String getNoOfPeople() {
		return noOfPeople;
	}

	public void setNoOfPeople(String noOfPeople) {
		this.noOfPeople = noOfPeople;
	}

	public String getNonJuvenile() {
		return nonJuvenile;
	}

	public void setNonJuvenile(String nonJuvenile) {
		this.nonJuvenile = nonJuvenile;
	}

	public String getNoOfSmokers() {
		return noOfSmokers;
	}

	public void setNoOfSmokers(String noOfSmokers) {
		this.noOfSmokers = noOfSmokers;
	}

	public String getPetIndicator() {
		return petIndicator;
	}

	public void setPetIndicator(String petIndicator) {
		this.petIndicator = petIndicator;
	}
	
}
