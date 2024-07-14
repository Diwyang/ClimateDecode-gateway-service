package com.climate.decode.gateway.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.server.ResponseStatusException;

import com.climate.decode.gateway.response.ApiResponse;

public interface AuthTokenApi {


	@PostMapping("/api/auth/login")
	public ApiResponse<?> login(ServerHttpRequest serverHttpRequest,
			@RequestHeader(value = HttpHeaders.ACCEPT_LANGUAGE, defaultValue = "us") String language)
			throws ResponseStatusException;
	
	
}
