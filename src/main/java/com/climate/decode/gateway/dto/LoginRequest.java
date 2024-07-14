package com.climate.decode.gateway.dto;


import jakarta.validation.constraints.NotBlank;

public class LoginRequest {
	@NotBlank
	private String key;
	
	private String password;
	
	private String role="User";
	
	private String otp;
	
	
	public LoginRequest() {
		
	}
	public LoginRequest(@NotBlank String key, @NotBlank String password, String role) {
		super();
		this.key = key;
		this.password = password;
		this.role = role;
	
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key= key;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getOtp() {
		return otp;
	}
	public void setOtp(String otp) {
		this.otp = otp;
	}
	
	
}
