package tcs.bits.hackathon.hoquote.bean;

import org.hibernate.validator.constraints.NotEmpty;

public class CurrentInsurancePO extends HOQAbstractBean{
	
	@NotEmpty
	private String priorInsurance;
	
	private String currentInsurer;
	
	private String currentPolicyExpiration;
	
	private String claimInLastFiveYears;

	public String getPriorInsurance() {
		return priorInsurance;
	}

	public void setPriorInsurance(String priorInsurance) {
		this.priorInsurance = priorInsurance;
	}

	public String getCurrentInsurer() {
		return currentInsurer;
	}

	public void setCurrentInsurer(String currentInsurer) {
		this.currentInsurer = currentInsurer;
	}

	public String getCurrentPolicyExpiration() {
		return currentPolicyExpiration;
	}

	public void setCurrentPolicyExpiration(String currentPolicyExpiration) {
		this.currentPolicyExpiration = currentPolicyExpiration;
	}

	public String getClaimInLastFiveYears() {
		return claimInLastFiveYears;
	}

	public void setClaimInLastFiveYears(String claimInLastFiveYears) {
		this.claimInLastFiveYears = claimInLastFiveYears;
	}

}
