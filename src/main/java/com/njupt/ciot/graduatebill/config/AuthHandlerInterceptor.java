package com.njupt.ciot.graduatebill.config;

import com.njupt.ciot.graduatebill.domain.User;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description 拦截器
 * @Author ShGuan
 * @Date 2019/5/7 14:53
 **/
public class AuthHandlerInterceptor implements HandlerInterceptor{

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (handler instanceof HandlerMethod){
            HandlerMethod handlerMethod = (HandlerMethod) handler;
            NeedLogin needLogin = handlerMethod.getMethodAnnotation(NeedLogin.class);
            if (needLogin != null){
                User user = (User) request.getSession().getAttribute("user");
                if (user == null){
                    response.sendRedirect("/signin");
                    return false;
                }
            }
        }
        return true;
    }
}