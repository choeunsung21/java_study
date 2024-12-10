package com.gn.practice03.exeption;

public class InvalidCredentialsException extends Exception {
	public InvalidCredentialsException() {

	}

	public InvalidCredentialsException(String msg) {
		super(msg);
	}
}
