package com.njupt.ciot.graduatebill.service;

import com.njupt.ciot.graduatebill.domain.User;


/**
 * @Description 登录服务接口
 * @Author ShGuan
 * @Date 2019/5/7 16:31
 **/
public interface LoginService {

    boolean loginVerify(User user) throws Exception;

}
