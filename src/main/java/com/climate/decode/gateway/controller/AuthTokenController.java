package com.climate.decode.gateway.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.web.server.ResponseStatusException;

import com.climate.decode.gateway.model.LoginResponse;
import com.climate.decode.gateway.response.ApiResponse;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AuthTokenController implements AuthTokenApi {


	@Value("${cd.https-enabled}")
	private boolean httpsEnabled;

	@Override
	public ApiResponse<?> login(ServerHttpRequest serverHttpRequest, String language) throws ResponseStatusException {

		log.info("AuthNController POST /login");
		try {
			LoginResponse model = new LoginResponse();
			log.debug("URI: " + serverHttpRequest.getURI().toString());
			log.debug("Path: " + serverHttpRequest.getURI().getPath());

			log.debug("Host: {}", serverHttpRequest.getURI().getHost());
			log.debug("Scheme: {}", serverHttpRequest.getURI().getScheme());
			log.debug("Port: {}", serverHttpRequest.getURI().getPort());
			log.debug("Raw: {}", serverHttpRequest.getURI().getRawPath());
			log.debug("Context Path: {}", serverHttpRequest.getPath().contextPath().value());
			log.debug("Pat Path: {}", serverHttpRequest.getPath().value());

			String scheme = serverHttpRequest.getURI().getScheme();
			String host = serverHttpRequest.getURI().getHost();
			int port = serverHttpRequest.getURI().getPort();
			String context = serverHttpRequest.getPath().contextPath().value();
//			String authURL = serverHttpRequest.getURI().toString()
//					+ OAuth2AuthorizationRequestRedirectFilter.DEFAULT_AUTHORIZATION_REQUEST_BASE_URI + "/keycloak";
//
//			log.debug("authURL ---> DEFAULT_AUTHORIZATION_REQUEST_BASE_URI---> {}",
//					OAuth2AuthorizationRequestRedirectFilter.DEFAULT_AUTHORIZATION_REQUEST_BASE_URI);
//			log.debug("authURL {}", authURL);
//
//			String authUrl = (httpsEnabled ? "https" : "http") + "://" + host
//					+ OAuth2AuthorizationRequestRedirectFilter.DEFAULT_AUTHORIZATION_REQUEST_BASE_URI + "/keycloak";

//			log.debug("Effective authURL  {}", authUrl);
//			model.setAuthorizationRequestUrl(authUrl);
//			return new GenericResponse(model,
//					messageSource.getMessage("success", null, Locale.forLanguageTag(language)), HttpStatus.OK.value());
			return ApiResponse.ofSuccess("Success");

		} catch (Exception e) {
			e.printStackTrace();
			log.error("{}", e.getLocalizedMessage());

			throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
		}
	}

}
