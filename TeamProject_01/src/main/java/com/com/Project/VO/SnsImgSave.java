package com.com.Project.VO;

public class SnsImgSave {
	private int imgSeq;
    private int snsSeq;
    private String pathName;
    private String dbName;
	public SnsImgSave(int imgSeq, int snsSeq, String pathName, String dbName) {
		super();
		this.imgSeq = imgSeq;
		this.snsSeq = snsSeq;
		this.pathName = pathName;
		this.dbName = dbName;
	}
	public SnsImgSave() {
		super();
	}
	public int getImgSeq() {
		return imgSeq;
	}
	public void setImgSeq(int imgSeq) {
		this.imgSeq = imgSeq;
	}
	public int getSnsSeq() {
		return snsSeq;
	}
	public void setSnsSeq(int snsSeq) {
		this.snsSeq = snsSeq;
	}
	public String getPathName() {
		return pathName;
	}
	public void setPathName(String pathName) {
		this.pathName = pathName;
	}
	public String getDbName() {
		return dbName;
	}
	public void setDbName(String dbName) {
		this.dbName = dbName;
	}
	@Override
	public String toString() {
		return "SnsImgSave [imgSeq=" + imgSeq + ", snsSeq=" + snsSeq + ", pathName=" + pathName + ", dbName=" + dbName
				+ "]";
	}
    
	
}
