package com.journaldev.spring.model;

import java.util.List;

public class RestResponse {
	String status;
	String message;
	List<RestRequest> sampleRequest; 
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<RestRequest> getSampleRequest() {
		return sampleRequest;
	}
	public void setSampleRequest(List<RestRequest> sampleRequest) {
		this.sampleRequest = sampleRequest;
	}
	

}
