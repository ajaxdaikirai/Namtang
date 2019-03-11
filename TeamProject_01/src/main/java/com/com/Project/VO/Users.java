package com.com.Project.VO;

public class Users {
	private int userSeq;
    private String userId;
    private String userPw;
    private String userName;
    private String userGender;
    private String userBirth;
    private String userAddress;
    private int userPhone;
    private String userNationality;
    private String userGrade;
    private String indate;
    private String userChoice;
    private int point;
    private String loginType;
	public Users(int userSeq, String userId, String userPw, String userName, String userGender, String userBirth,
			String userAddress, int userPhone, String userNationality) {
		super();
		this.userSeq = userSeq;
		this.userId = userId;
		this.userPw = userPw;
		this.userName = userName;
		this.userGender = userGender;
		this.userBirth = userBirth;
		this.userAddress = userAddress;
		this.userPhone = userPhone;
		this.userNationality = userNationality;
	}
	public Users() {
		super();
	}
	@Override
	public String toString() {
		return "Users [userSeq=" + userSeq + ", userId=" + userId + ", userPw=" + userPw + ", userName=" + userName
				+ ", userGender=" + userGender + ", userBirth=" + userBirth + ", userAddress=" + userAddress
				+ ", userPhone=" + userPhone + ", userNationality=" + userNationality + ", userGrade=" + userGrade
				+ ", indate=" + indate + ", userChoice=" + userChoice + ", point=" + point + ", loginType=" + loginType
				+ "]";
	}
	public int getUserSeq() {
		return userSeq;
	}
	public void setUserSeq(int userSeq) {
		this.userSeq = userSeq;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public String getUserBirth() {
		return userBirth;
	}
	public void setUserBirth(String userBirth) {
		this.userBirth = userBirth;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public int getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(int userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserNationality() {
		return userNationality;
	}
	public void setUserNationality(String userNationality) {
		this.userNationality = userNationality;
	}
	public String getUserGrade() {
		return userGrade;
	}
	public void setUserGrade(String userGrade) {
		this.userGrade = userGrade;
	}
	public String getIndate() {
		return indate;
	}
	public void setIndate(String indate) {
		this.indate = indate;
	}
	public String getUserChoice() {
		return userChoice;
	}
	public void setUserChoice(String userChoice) {
		this.userChoice = userChoice;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public String getLoginType() {
		return loginType;
	}
	public void setLoginType(String loginType) {
		this.loginType = loginType;
	}
    
    
}
