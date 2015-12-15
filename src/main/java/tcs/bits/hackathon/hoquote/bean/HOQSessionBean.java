package tcs.bits.hackathon.hoquote.bean;

public class HOQSessionBean {
	
	private String requestId;
	
	private String zipCode;
	
	private PersonalInforamtionPO personalInforamtionPO;
	
	private CurrentInsurancePO currentInsurancePO;
	
	private ClaimOrLossPO claimOrLossPO;
	
	private PropertyDetailsPO propertyDetailsPO;
	
	private QuoteSummaryPO quoteSummaryPO;
	
	private PaymentPO paymentPO;
	
	private ThankYouPO thankYouPO;
	
	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	
	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public PersonalInforamtionPO getPersonalInforamtionPO() {
		return personalInforamtionPO;
	}

	public void setPersonalInforamtionPO(PersonalInforamtionPO personalInforamtionPO) {
		this.personalInforamtionPO = personalInforamtionPO;
	}

	public CurrentInsurancePO getCurrentInsurancePO() {
		return currentInsurancePO;
	}

	public void setCurrentInsurancePO(CurrentInsurancePO currentInsurancePO) {
		this.currentInsurancePO = currentInsurancePO;
	}

	public ClaimOrLossPO getClaimOrLossPO() {
		return claimOrLossPO;
	}

	public void setClaimOrLossPO(ClaimOrLossPO claimOrLossPO) {
		this.claimOrLossPO = claimOrLossPO;
	}

	public PropertyDetailsPO getPropertyDetailsPO() {
		return propertyDetailsPO;
	}

	public void setPropertyDetailsPO(PropertyDetailsPO propertyDetailsPO) {
		this.propertyDetailsPO = propertyDetailsPO;
	}

	public QuoteSummaryPO getQuoteSummaryPO() {
		return quoteSummaryPO;
	}

	public void setQuoteSummaryPO(QuoteSummaryPO quoteSummaryPO) {
		this.quoteSummaryPO = quoteSummaryPO;
	}

	public PaymentPO getPaymentPO() {
		return paymentPO;
	}

	public void setPaymentPO(PaymentPO paymentPO) {
		this.paymentPO = paymentPO;
	}

	public ThankYouPO getThankYouPO() {
		return thankYouPO;
	}

	public void setThankYouPO(ThankYouPO thankYouPO) {
		this.thankYouPO = thankYouPO;
	}
	
}
