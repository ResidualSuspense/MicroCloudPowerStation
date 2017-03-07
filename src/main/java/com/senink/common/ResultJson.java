package com.senink.common;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * 统一接口返回
 * @author Xs
 *
 * @param <T> JSON中的data字段的类型，如List<NlUser>
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ResultJson<T> {
	private String code;
	private String message;
	private T data;

	public ResultJson() {
		super();
	}

	public ResultJson(String code, String message) {
		super();
		this.code = code;
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
