package com.com.Project.VO;

public class SnsComment {
	private int commentSeq;
    private int snsSeq;
    private String snsComment;
    private String indate;
    private int writerSeq;
	public SnsComment(int commentSeq, int snsSeq, String snsComment, String indate, int writerSeq) {
		super();
		this.commentSeq = commentSeq;
		this.snsSeq = snsSeq;
		this.snsComment = snsComment;
		this.indate = indate;
		this.writerSeq = writerSeq;
	}
	public SnsComment() {
		super();
	}
	public int getCommentSeq() {
		return commentSeq;
	}
	public void setCommentSeq(int commentSeq) {
		this.commentSeq = commentSeq;
	}
	public int getSnsSeq() {
		return snsSeq;
	}
	public void setSnsSeq(int snsSeq) {
		this.snsSeq = snsSeq;
	}
	public String getSnsComment() {
		return snsComment;
	}
	public void setSnsComment(String snsComment) {
		this.snsComment = snsComment;
	}
	public String getIndate() {
		return indate;
	}
	public void setIndate(String indate) {
		this.indate = indate;
	}
	public int getWriterSeq() {
		return writerSeq;
	}
	public void setWriterSeq(int writerSeq) {
		this.writerSeq = writerSeq;
	}
	@Override
	public String toString() {
		return "SnsComment [commentSeq=" + commentSeq + ", snsSeq=" + snsSeq + ", snsComment=" + snsComment
				+ ", indate=" + indate + ", writerSeq=" + writerSeq + "]";
	}
	
	
}
