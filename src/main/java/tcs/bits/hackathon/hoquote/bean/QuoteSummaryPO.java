package tcs.bits.hackathon.hoquote.bean;

public class QuoteSummaryPO extends HOQAbstractBean {

	private String dwelling;
	
	private String otherStructures;
	
	private String personalPropertyCov;
	
	private String lossOfUse;
	
	private String medicalPayment;
	
	private String deductible;

	public String getDwelling() {
		return dwelling;
	}

	public void setDwelling(String dwelling) {
		this.dwelling = dwelling;
	}

	public String getOtherStructures() {
		return otherStructures;
	}

	public void setOtherStructures(String otherStructures) {
		this.otherStructures = otherStructures;
	}

	public String getPersonalPropertyCov() {
		return personalPropertyCov;
	}

	public void setPersonalPropertyCov(String personalPropertyCov) {
		this.personalPropertyCov = personalPropertyCov;
	}

	public String getLossOfUse() {
		return lossOfUse;
	}

	public void setLossOfUse(String lossOfUse) {
		this.lossOfUse = lossOfUse;
	}

	public String getMedicalPayment() {
		return medicalPayment;
	}

	public void setMedicalPayment(String medicalPayment) {
		this.medicalPayment = medicalPayment;
	}

	public String getDeductible() {
		return deductible;
	}

	public void setDeductible(String deductible) {
		this.deductible = deductible;
	}
	
}
