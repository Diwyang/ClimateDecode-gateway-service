package com.climate.decode.gateway.dto;

import java.time.ZonedDateTime;
import java.util.List;


public class UserResponse {

	private String username;
	private String email;
	private List<String> roles;
	private String accessToken;

	private String refreshToken;

	private String type = "Bearer";
	private String passwordChaned;
	private String mobileNo;
	private Long userId;
	private ZonedDateTime createdDate;
	private String isPasswordUpdated;
	private Long expireIn;
	private Long refreshExpireIn;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<String> getRoles() {
		return roles;
	}
	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public String getRefreshToken() {
		return refreshToken;
	}
	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPasswordChaned() {
		return passwordChaned;
	}
	public void setPasswordChaned(String passwordChaned) {
		this.passwordChaned = passwordChaned;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public ZonedDateTime getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(ZonedDateTime createdDate) {
		this.createdDate = createdDate;
	}
	public String getIsPasswordUpdated() {
		return isPasswordUpdated;
	}
	public void setIsPasswordUpdated(String isPasswordUpdated) {
		this.isPasswordUpdated = isPasswordUpdated;
	}
	public Long getExpireIn() {
		return expireIn;
	}
	public void setExpireIn(Long expireIn) {
		this.expireIn = expireIn;
	}
	public Long getRefreshExpireIn() {
		return refreshExpireIn;
	}
	public void setRefreshExpireIn(Long refreshExpireIn) {
		this.refreshExpireIn = refreshExpireIn;
	}
	public UserResponse(String username, String email, List<String> roles, String accessToken, String refreshToken,
			String type, String passwordChaned, String mobileNo, Long userId, ZonedDateTime createdDate,
			String isPasswordUpdated, Long expireIn, Long refreshExpireIn) {
		super();
		this.username = username;
		this.email = email;
		this.roles = roles;
		this.accessToken = accessToken;
		this.refreshToken = refreshToken;
		this.type = type;
		this.passwordChaned = passwordChaned;
		this.mobileNo = mobileNo;
		this.userId = userId;
		this.createdDate = createdDate;
		this.isPasswordUpdated = isPasswordUpdated;
		this.expireIn = expireIn;
		this.refreshExpireIn = refreshExpireIn;
	}
	
	
	
	public UserResponse(String accessToken, String refreshToken, Long expireIn, Long refreshExpireIn) {
		super();
		this.accessToken = accessToken;
		this.refreshToken = refreshToken;
		this.expireIn = expireIn;
		this.refreshExpireIn = refreshExpireIn;
	}
	@Override
	public String toString() {
		return "UserResponse [username=" + username + ", email=" + email + ", roles=" + roles + ", accessToken="
				+ accessToken + ", refreshToken=" + refreshToken + ", type=" + type + ", passwordChaned="
				+ passwordChaned + ", mobileNo=" + mobileNo + ", userId=" + userId + ", createdDate=" + createdDate
				+ ", isPasswordUpdated=" + isPasswordUpdated + ", expireIn=" + expireIn + ", refreshExpireIn="
				+ refreshExpireIn + "]";
	}

	
	
	}
