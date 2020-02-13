package com.expn;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AdviceController {
	@ExceptionHandler(value=RuntimeException.class)
	public String exceptionHandiler() {
		return "exception";
	}
}