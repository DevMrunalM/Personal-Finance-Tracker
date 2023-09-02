package com.spring_dev.model;

public class NameRequest {
	
	private String name;

	public NameRequest(String name) {
		super();
		this.name = name;
	}

	public NameRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "NameRequest [name=" + name + "]";
	}
	
	
	

}
