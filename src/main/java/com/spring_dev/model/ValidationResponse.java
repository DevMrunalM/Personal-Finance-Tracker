package com.spring_dev.model;

public class ValidationResponse {
	
	
	private String status;
	private String message;
	
	public ValidationResponse(String status, String message) {
		super();
		this.status = status;
		this.message = message;
	}

	public ValidationResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

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

	@Override
	public String toString() {
		return "ValidationSuccess [status=" + status + ", message=" + message + "]";
	}
	
	
	

}
