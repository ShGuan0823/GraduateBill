package com.njupt.ciot.graduatebill.domain;

import lombok.Data;

/**
 * @Author ShGuan
 * @Description 用户类，用于登录
 * @Date 2019/5/5 17:55
 **/
@Data
public class User extends BaseEntity{
    /**
     * 帐号
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 学号
     */
    private String stuId;
    /**
     * 身份证号
     */
    private String identity;

}