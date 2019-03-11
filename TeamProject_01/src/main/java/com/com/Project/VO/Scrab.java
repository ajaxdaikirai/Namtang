package com.com.Project.VO;

public class Scrab {
	private int scrabSeq;
    private int userSeq;
    private int snsSeq;
    private String indate;
	public Scrab(int scrabSeq, int userSeq, int snsSeq) {
		super();
		this.scrabSeq = scrabSeq;
		this.userSeq = userSeq;
		this.snsSeq = snsSeq;
	}
	public Scrab() {
		super();
	}
	public int getScrabSeq() {
		return scrabSeq;
	}
	public void setScrabSeq(int scrabSeq) {
		this.scrabSeq = scrabSeq;
	}
	public int getUserSeq() {
		return userSeq;
	}
	public void setUserSeq(int userSeq) {
		this.userSeq = userSeq;
	}
	public int getSnsSeq() {
		return snsSeq;
	}
	public void setSnsSeq(int snsSeq) {
		this.snsSeq = snsSeq;
	}
	public String getIndate() {
		return indate;
	}
	public void setIndate(String indate) {
		this.indate = indate;
	}
	@Override
	public String toString() {
		return "Scrab [scrabSeq=" + scrabSeq + ", userSeq=" + userSeq + ", snsSeq=" + snsSeq + ", indate=" + indate
				+ "]";
	}
    
    
}
