package com.example.exception;

public class ParkingException extends RuntimeException {
private static final long serialVersionUID=1L;
	
	public ParkingException(String msz) {
		super(msz);
	}

}
