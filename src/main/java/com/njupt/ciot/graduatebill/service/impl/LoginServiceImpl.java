package com.njupt.ciot.graduatebill.service.impl;

import com.njupt.ciot.graduatebill.dao.LoginDao;
import com.njupt.ciot.graduatebill.domain.User;
import com.njupt.ciot.graduatebill.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @Description 登录服务实现类
 * @Author ShGuan
 * @Date 2019/5/7 16:32
 **/
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    LoginDao loginDao;

    @Override
    public boolean loginVerify(User user) {
        String temp = loginDao.findPasswordByUsername(user.getUsername());
        if (temp.equals(user.getPassword())) {
            return true;
        }
        return false;
    }



}