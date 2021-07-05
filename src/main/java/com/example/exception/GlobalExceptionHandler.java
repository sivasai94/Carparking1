package com.example.exception;

import org.springframework.http.HttpStatus;
 import org.springframework.http.ResponseEntity;
 import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorInfo> ParkingExceptionHandler(Exception ex){
		ErrorInfo errorInfo=new ErrorInfo("Exception",ex.getMessage(),HttpStatus.BAD_REQUEST.value());
		return new ResponseEntity<>(errorInfo,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(ParkingException.class)
	public ResponseEntity<ErrorInfo> ParkingExceptionalHandler(ParkingException ex){
		ErrorInfo errorInfo=new ErrorInfo("ParkingNotFound",ex.getMessage(),HttpStatus.NOT_FOUND.value());
		return new ResponseEntity<>(errorInfo,HttpStatus.NOT_FOUND);
	}
}


