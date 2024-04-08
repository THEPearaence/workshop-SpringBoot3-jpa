package com.examplou.course.services.exceptions;

public class DataBaseException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public DataBaseException(String mgs) {
		super(mgs);
	}
}
