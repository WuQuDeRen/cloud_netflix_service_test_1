package com.fj.boot.app.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ServlerExceptionHandler {
	
	@ExceptionHandler({RuntimeException.class})
	@ResponseBody
	public ResultMsg<?> handleException(HttpServletRequest request, HttpServletResponse response, RuntimeException e) {
		return ResultMsg.fail(e.getMessage(), e.getMessage());
	}
}
