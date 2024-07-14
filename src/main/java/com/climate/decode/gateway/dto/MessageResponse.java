package com.climate.decode.gateway.dto;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(value = Include.NON_NULL)
public class MessageResponse {
	
	@JsonInclude(value = Include.NON_DEFAULT)
	private int key;
	private String message;
	private List<?> data;
	private String status;

	
	
	public MessageResponse(int key, String message, List<?> data, String status) {
		super();
		this.key = key;
		this.message = message;
		this.data = data;
		this.status = status;
	}

	public MessageResponse(int key, List data, String status) {
		this.key = key;
		this.data = data;
		this.status = status;
	}
	
	public MessageResponse(int key, String message, String status) {
		this.key = key;
		this.message = message;
		this.status = status;
	}

	public MessageResponse(String message) {
		this.message = message;
	}
	public List<?> getData() {
		return data;
	}

	public void setData(List<?> data) {
		this.data = data;
	}

	public MessageResponse() {
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	
}
