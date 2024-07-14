package com.climate.decode.gateway.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class UserInfoResponse {
	
	private String username;
	private String email;
	private List<String> roles = new ArrayList<>();
	private String passwordChaned;
	private String mobileNo;
	private String userId;
	private String createdDate;
	private String isPasswordUpdated;
	private String tenantID;
	private String prefLanguage;
	
}
