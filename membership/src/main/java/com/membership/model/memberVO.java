package com.membership.model;

public class memberVO {
	private int id;
	private String userId;
	private String userPw;
	private String userName;
	private int userAge;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getUsreName() {
		return userName;
	}
	public void setUsreName(String usreName) {
		this.userName = usreName;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	
	@Override
	public String toString() {
		return "memberVO [id=" + id + ", userId=" + userId + ", userPw=" + userPw + ", usreName=" + userName
				+ ", userAge=" + userAge + "]";
	}
	
}
