package com.com.Project.VO;

public class HashTag {
	private int snsSeq;
    private String firstTag;
    private String secondTag;
    private String thirdTag;
	public HashTag(int snsSeq, String firstTag, String secondTag, String thirdTag) {
		super();
		this.snsSeq = snsSeq;
		this.firstTag = firstTag;
		this.secondTag = secondTag;
		this.thirdTag = thirdTag;
	}
	public HashTag() {
		super();
	}
	
	public HashTag(int snsSeq, String firstTag, String secondTag) {
		super();
		this.snsSeq = snsSeq;
		this.firstTag = firstTag;
		this.secondTag = secondTag;
	}
	public HashTag(int snsSeq, String firstTag) {
		super();
		this.snsSeq = snsSeq;
		this.firstTag = firstTag;
	}
	@Override
	public String toString() {
		return "HashTag [snsSeq=" + snsSeq + ", firstTag=" + firstTag + ", secondTag=" + secondTag + ", thirdTag="
				+ thirdTag + "]";
	}
	public int getSnsSeq() {
		return snsSeq;
	}
	public void setSnsSeq(int snsSeq) {
		this.snsSeq = snsSeq;
	}
	public String getFirstTag() {
		return firstTag;
	}
	public void setFirstTag(String firstTag) {
		this.firstTag = firstTag;
	}
	public String getSecondTag() {
		return secondTag;
	}
	public void setSecondTag(String secondTag) {
		this.secondTag = secondTag;
	}
	public String getThirdTag() {
		return thirdTag;
	}
	public void setThirdTag(String thirdTag) {
		this.thirdTag = thirdTag;
	}
    
    
}
