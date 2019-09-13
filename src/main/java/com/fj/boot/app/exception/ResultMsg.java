package com.fj.boot.app.exception;

import lombok.Data;

@Data
public class ResultMsg<T> {
	private Boolean isSuccess;
	private String code;
	private String errorMsg;
	private T data;
	
	public static <T> ResultMsg<T> success(T data) {
		ResultMsg<T> result = new ResultMsg<T>();
		result.isSuccess = true;
		result.code = "200";
		result.data = data;
		return result;
	}
	
	public static <T> ResultMsg<T> fail(String code, String errorMsg) {
		ResultMsg<T> result = new ResultMsg<T>();
		result.isSuccess = false;
		result.code = code;
		result.errorMsg = errorMsg;
		return result;
	}
} 
