package com.njupt.ciot.graduatebill.web;

import com.njupt.ciot.graduatebill.common.result.Result;
import com.njupt.ciot.graduatebill.common.result.ResultGenerator;
import com.njupt.ciot.graduatebill.domain.User;
import com.njupt.ciot.graduatebill.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @Description 登录控制器
 * @Author ShGuan
 * @Date 2019/5/7 15:45
 **/
@Validated
@RestController
public class LoginController {

    @Autowired
    LoginService loginService;

    @PostMapping("/loginVerify")
    public Result<Boolean> loginVerify(@RequestBody @Valid User user) {
        boolean result = loginService.loginVerify(user);
        if (result) {
            return ResultGenerator.genSuccessResult(result);
        } else {
            return ResultGenerator.genFailResult("密码不正确");
        }
    }

}