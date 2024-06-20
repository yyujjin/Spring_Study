package com.membership.model;

import lombok.Getter;
import lombok.Setter;

//어노테이션도 있고 get/set/ 함수도 있다면 우선순위는?

@Getter
@Setter
public class memberVO {
	private int id;
	private String userId;
	private String userPw;
	private String userName;
	private String userAge;
	
//	public String getId() {
//		
//		return Integer.toString(id);
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getUserId() {
//		return userId;
//	}
//	public void setUserId(String userId) {
//		this.userId = userId;
//	}
//	public String getUserPw() {
//		return userPw;
//	}
//	public void setUserPw(String userPw) {
//		this.userPw = userPw;
//	}
//	public String getUserName() {
//		return userName;
//	}
//	public void setUserName(String userName) {
//		this.userName = userName;
//	}
//	public String getUserAge() {
//		return userAge;
//	}
//	public void setUserAge(String userAge) {
//		this.userAge = userAge;
//	}
	
	@Override
	public String toString() {
		return "memberVO [id=" + id + ", userId=" + userId + ", userPw=" + userPw + ", userName=" + userName
				+ ", userAge=" + userAge + "]";
	}
	
}
