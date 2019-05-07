package com.njupt.ciot.graduatebill.common.result;

/**
 * @Description 统一封装请求回复
 * @Author ShGuan
 * @Date 2019/5/7 15:14
 **/
public class Result<T> {

    private int code;

    private String message;

    private T data;

    public Result setCode(ResultCode resultCode) {
        this.code = resultCode.code;
        return this;
    }

    public int getCode() {
        return code;
    }

    public Result setCode(int code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public Result setMessage(String message) {
        this.message = message;
        return this;
    }

    public T getData() {
        return data;
    }

    public Result setData(T data) {
        this.data = data;
        return this;
    }
}