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
	
	@NotEmpty
	private String typeOfHome;
	
	@NotEmpty
	private String styleOfHome;
	
	@NotEmpty
	private String yearRoofInstalled;
	
	@NotEmpty
	private String roofMaterial;
	
	@NotEmpty
	private String sqftOfHome;
	
	@Override
	public String toString() {
		return "PropertyDetails [effectiveDate=" + effectiveDate + ", mortgagePayment=" + mortgagePayment
				+ ", yearOfPurchase=" + yearOfPurchase + ", yearBuilt=" + yearBuilt + ", homeDescription="
				+ homeDescription + ", noOfPeople=" + noOfPeople + ", nonJuvenile=" + nonJuvenile + ", noOfSmokers="
				+ noOfSmokers + ", petIndicator=" + petIndicator + ", typeOfHome=" + typeOfHome + ", styleOfHome="
				+ styleOfHome + ", yearRoofInstalled=" + yearRoofInstalled + ", roofMaterial=" + roofMaterial
				+ ", sqftOfHome=" + sqftOfHome + "]";
	}

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

	public String getTypeOfHome() {
		return typeOfHome;
	}

	public void setTypeOfHome(String typeOfHome) {
		this.typeOfHome = typeOfHome;
	}

	public String getStyleOfHome() {
		return styleOfHome;
	}

	public void setStyleOfHome(String styleOfHome) {
		this.styleOfHome = styleOfHome;
	}

	public String getYearRoofInstalled() {
		return yearRoofInstalled;
	}

	public void setYearRoofInstalled(String yearRoofInstalled) {
		this.yearRoofInstalled = yearRoofInstalled;
	}

	public String getRoofMaterial() {
		return roofMaterial;
	}

	public void setRoofMaterial(String roofMaterial) {
		this.roofMaterial = roofMaterial;
	}

	public String getSqftOfHome() {
		return sqftOfHome;
	}

	public void setSqftOfHome(String sqftOfHome) {
		this.sqftOfHome = sqftOfHome;
	}
	
}
