package com.njupt.ciot.graduatebill.common.result;

/**
 * @Description 响应码枚举
 * @Author ShGuan
 * @Date 2019/5/7 15:12
 **/
public enum ResultCode {

    SUCCESS(200),

    FAIL(500);

    public int code;

    ResultCode(int code) { this.code = code; }
}