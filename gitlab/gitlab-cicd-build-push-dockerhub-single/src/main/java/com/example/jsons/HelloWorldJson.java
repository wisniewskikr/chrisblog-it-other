package com.example.jsons;

public class HelloWorldJson {
	
	private String message;
	private String port;
	private String uuid;
	
	public HelloWorldJson() {}
	
	public HelloWorldJson(String message, String port, String uuid) {
		this.message = message;
		this.port = port;
		this.uuid = uuid;
	}

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}

	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}	
	
}
