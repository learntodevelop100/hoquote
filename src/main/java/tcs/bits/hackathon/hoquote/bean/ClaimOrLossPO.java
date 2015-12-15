package tcs.bits.hackathon.hoquote.bean;

import org.hibernate.validator.constraints.NotEmpty;

public class ClaimOrLossPO extends HOQAbstractBean {

	@NotEmpty
	private String typeOfLoss;

	@NotEmpty
	private String yearOfLoss;

	@NotEmpty
	private String lossAmount;

	@Override
	public String toString() {
		return "ClaimOrLossPO [typeOfLoss=" + typeOfLoss + ", yearOfLoss=" + yearOfLoss + ", lossAmount=" + lossAmount
				+ ", reqId=" + reqId + ", evtNm=" + evtNm + ", ZipCode=" + ZipCode + ", PageName=" + PageName + ", TS="
				+ TS + "]";
	}

	public String getTypeOfLoss() {
		return typeOfLoss;
	}

	public void setTypeOfLoss(String typeOfLoss) {
		this.typeOfLoss = typeOfLoss;
	}

	public String getLossAmount() {
		return lossAmount;
	}

	public void setLossAmount(String lossAmount) {
		this.lossAmount = lossAmount;
	}

	public String getYearOfLoss() {
		return yearOfLoss;
	}

	public void setYearOfLoss(String yearOfLoss) {
		this.yearOfLoss = yearOfLoss;
	}
}
