package com.jlau.easyweb.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: LiangYuChao
 * @Date: 2023/09/12 05:24:13
 * @Version: 1.0
 * @Description: 通用返回类
 */
@Data
public class BaseResponse<T> implements Serializable {

    private static final long serialVersionUID = 4887078045405290846L;
    private int code;

    private T data;

    private String message;

    public BaseResponse(int code, T data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public BaseResponse(int code, T data) {
        this(code, data, "");
    }

    public BaseResponse(Error errorCode) {
        this(errorCode.getCode(), null, errorCode.getMessage());
    }
}
