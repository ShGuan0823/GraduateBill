package com.njupt.ciot.graduatebill.common.result;

/**
 * @Description 响应结果生成器
 * @Author ShGuan
 * @Date 2019/5/7 15:17
 **/
public class ResultGenerator {

    private static final String DEFAULT_SUCCESS_MESSAGE = "SUCCESS";

    public static Result genSuccessResult(Object data) {
        return new Result()
                .setCode(ResultCode.SUCCESS)
                .setMessage(DEFAULT_SUCCESS_MESSAGE)
                .setData(data);
    }

    public static Result genFailResult(String msg) {
        return new Result()
                .setCode(ResultCode.FAIL)
                .setMessage(msg);
    }
}