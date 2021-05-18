package com.claims.exception;
/*
 * custom exception
 */
public class SubmitClaimsException extends Exception {
	private static final long serialVersionUID = 1L;
	private String messagecode;
	private String message;
	/*
	 * args constructor
	 */
	public SubmitClaimsException(String messagecode,String message) {
		this.messagecode=messagecode;
		this.message=message;
	}
	/**
	 * @return the messagecode
	 */
	public String getMessagecode() {
		return messagecode;
	}
	/**
	 * @param messagecode the messagecode to set
	 */
	public void setMessagecode(String messagecode) {
		this.messagecode = messagecode;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
