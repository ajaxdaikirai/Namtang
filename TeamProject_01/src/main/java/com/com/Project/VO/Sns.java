package com.com.Project.VO;

public class Sns {
	private int snsSeq;
	private int userSeq;
    private String snsContent;          
    private int count;
    private String indate;
	public Sns(int userSeq, String snsContent) {
		super();
		this.userSeq = userSeq;
		this.snsContent = snsContent;
	}
	public Sns() {
		super();
	}
	public int getSnsSeq() {
		return snsSeq;
	}
	public void setSnsSeq(int snsSeq) {
		this.snsSeq = snsSeq;
	}
	public int getUserSeq() {
		return userSeq;
	}
	public void setUserSeq(int userSeq) {
		this.userSeq = userSeq;
	}
	public String getSnsContent() {
		return snsContent;
	}
	public void setSnsContent(String snsContent) {
		this.snsContent = snsContent;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getIndate() {
		return indate;
	}
	public void setIndate(String indate) {
		this.indate = indate;
	}
	@Override
	public String toString() {
		return "Sns [snsSeq=" + snsSeq + ", userSeq=" + userSeq + ", snsContent=" + snsContent + ", count=" + count
				+ ", indate=" + indate + "]";
	}
    
}
