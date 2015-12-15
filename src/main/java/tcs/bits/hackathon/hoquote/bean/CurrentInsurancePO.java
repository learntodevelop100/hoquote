package tcs.bits.hackathon.hoquote.bean;

import org.hibernate.validator.constraints.NotEmpty;

public class CurrentInsurancePO extends HOQAbstractBean {

	@NotEmpty
	private String currentInsuranceIndicator;

	private String currentInsuranceCompany;

	private String currentPolicyExpiration;

	private String claimOrLossIndicator;

	@Override
	public String toString() {
		return "CurrentInsurance [currentInsuranceIndicator=" + currentInsuranceIndicator
				+ ", currentInsuranceCompany=" + currentInsuranceCompany + ", currentPolicyExpiration="
				+ currentPolicyExpiration + ", claimOrLossIndicator=" + claimOrLossIndicator + "]";
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

}
