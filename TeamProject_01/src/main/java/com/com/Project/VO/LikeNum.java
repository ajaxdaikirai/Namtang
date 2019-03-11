package com.com.Project.VO;

public class LikeNum {
	private int likeSeq;
    private int snsSeq;
    private int userSeq;
    private int heartNum;
	public LikeNum(int likeSeq, int snsSeq, int userSeq, int heartNum) {
		super();
		this.likeSeq = likeSeq;
		this.snsSeq = snsSeq;
		this.userSeq = userSeq;
		this.heartNum = heartNum;
	}
	public LikeNum() {
		super();
	}
	public int getLikeSeq() {
		return likeSeq;
	}
	public void setLikeSeq(int likeSeq) {
		this.likeSeq = likeSeq;
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
	public int getHeartNum() {
		return heartNum;
	}
	public void setHeartNum(int heartNum) {
		this.heartNum = heartNum;
	}
	@Override
	public String toString() {
		return "LikeNum [likeSeq=" + likeSeq + ", snsSeq=" + snsSeq + ", userSeq=" + userSeq + ", heartNum=" + heartNum
				+ "]";
	}
    
}
