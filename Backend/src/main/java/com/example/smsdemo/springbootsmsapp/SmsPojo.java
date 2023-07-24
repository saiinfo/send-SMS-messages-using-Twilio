package com.example.smsdemo.springbootsmsapp;

public class SmsPojo {
	private String to;
    private String message;
    
    
	@Override
	public String toString() {
		return "SmsPojo [to=" + to + ", message=" + message + "]";
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public SmsPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SmsPojo(String to, String message) {
		super();
		this.to = to;
		this.message = message;
	}
    
    
    
}
