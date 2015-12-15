package tcs.bits.hackathon.hoquote.bean;

import org.springframework.stereotype.Component;

@Component
public class HOQAbstractBean {
	
	protected String reqId;
	
	protected String evtNm;
	
	protected String ZipCode;
	
	protected String PageName;
	
	protected String TS;

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

}
