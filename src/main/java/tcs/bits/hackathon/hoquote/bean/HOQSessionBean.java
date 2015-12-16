package tcs.bits.hackathon.hoquote.bean;

public class HOQSessionBean {
	
	/*Event Header*/
	protected String reqId;
	
	protected String evtNm;
	
	protected String ZipCode;
	
	protected String PageName;
	
	protected String TS;
	
	/*Customer Information*/
	private String firstName;

	private String lastName;

	private String dob;

	private String streetAddress;

	private String city;

	private String state;

	private String email;

	private String phoneNumber;
	
	/*Current Insurance*/
	private String currentInsuranceIndicator;

	private String currentInsuranceCompany;

	private String currentPolicyExpiration;

	private String claimOrLossIndicator;
	
	/*Claim or Loss*/
	private String typeOfLoss;

	private String yearOfLoss;

	private String lossAmount;
	
	/*Property Details*/
	private String effectiveDate;
	
	private String mortgagePayment;
	
	private String yearOfPurchase;
	
	private String yearBuilt;
	
	private String homeDescription;
	
	private String noOfPeople;
	
	private String nonJuvenile;
	
	private String noOfSmokers;
	
	private String petIndicator;
	
	private String typeOfHome;
	
	private String styleOfHome;
	
	private String yearRoofInstalled;
	
	private String roofMaterial;
	
	private String sqftOfHome;
	
	@Override
	public String toString() {
		return "HOQSessionBean [reqId=" + reqId + ", evtNm=" + evtNm + ", ZipCode=" + ZipCode + ", PageName=" + PageName
				+ ", TS=" + TS + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob
				+ ", streetAddress=" + streetAddress + ", city=" + city + ", state=" + state + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + ", currentInsuranceIndicator=" + currentInsuranceIndicator
				+ ", currentInsuranceCompany=" + currentInsuranceCompany + ", currentPolicyExpiration="
				+ currentPolicyExpiration + ", claimOrLossIndicator=" + claimOrLossIndicator + ", typeOfLoss="
				+ typeOfLoss + ", yearOfLoss=" + yearOfLoss + ", lossAmount=" + lossAmount + ", effectiveDate="
				+ effectiveDate + ", mortgagePayment=" + mortgagePayment + ", yearOfPurchase=" + yearOfPurchase
				+ ", yearBuilt=" + yearBuilt + ", homeDescription=" + homeDescription + ", noOfPeople=" + noOfPeople
				+ ", nonJuvenile=" + nonJuvenile + ", noOfSmokers=" + noOfSmokers + ", petIndicator=" + petIndicator
				+ ", typeOfHome=" + typeOfHome + ", styleOfHome=" + styleOfHome + ", yearRoofInstalled="
				+ yearRoofInstalled + ", roofMaterial=" + roofMaterial + ", sqftOfHome=" + sqftOfHome + "]";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getReqId() {
		return reqId;
	}

	public void setReqId(String reqId) {
		this.reqId = reqId;
	}

	public String getEvtNm() {
		return evtNm;
	}

	public void setEvtNm(String evtNm) {
		this.evtNm = evtNm;
	}

	public String getZipCode() {
		return ZipCode;
	}

	public void setZipCode(String zipCode) {
		ZipCode = zipCode;
	}

	public String getPageName() {
		return PageName;
	}

	public void setPageName(String pageName) {
		PageName = pageName;
	}

	public String getTS() {
		return TS;
	}

	public void setTS(String tS) {
		TS = tS;
	}

	public String getCurrentInsuranceIndicator() {
		return currentInsuranceIndicator;
	}

	public void setCurrentInsuranceIndicator(String currentInsuranceIndicator) {
		this.currentInsuranceIndicator = currentInsuranceIndicator;
	}

	public String getCurrentInsuranceCompany() {
		return currentInsuranceCompany;
	}

	public void setCurrentInsuranceCompany(String currentInsuranceCompany) {
		this.currentInsuranceCompany = currentInsuranceCompany;
	}

	public String getCurrentPolicyExpiration() {
		return currentPolicyExpiration;
	}

	public void setCurrentPolicyExpiration(String currentPolicyExpiration) {
		this.currentPolicyExpiration = currentPolicyExpiration;
	}

	public String getClaimOrLossIndicator() {
		return claimOrLossIndicator;
	}

	public void setClaimOrLossIndicator(String claimOrLossIndicator) {
		this.claimOrLossIndicator = claimOrLossIndicator;
	}

	public String getTypeOfLoss() {
		return typeOfLoss;
	}

	public void setTypeOfLoss(String typeOfLoss) {
		this.typeOfLoss = typeOfLoss;
	}

	public String getYearOfLoss() {
		return yearOfLoss;
	}

	public void setYearOfLoss(String yearOfLoss) {
		this.yearOfLoss = yearOfLoss;
	}

	public String getLossAmount() {
		return lossAmount;
	}

	public void setLossAmount(String lossAmount) {
		this.lossAmount = lossAmount;
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
