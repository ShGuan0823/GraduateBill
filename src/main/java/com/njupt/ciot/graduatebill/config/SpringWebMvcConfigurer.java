package com.njupt.ciot.graduatebill.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Description 实现WebMvcConfigurer接口
 * @Author ShGuan
 * @Date 2019/5/7 14:51
 **/
@Configuration
public class SpringWebMvcConfigurer implements WebMvcConfigurer{

    @Autowired
    AuthHandlerInterceptor authHandlerInterceptor;

    /**
     * 静态资源映射配置
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }

    /**
     * 页面拦截器配置
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 拦截所有
        registry.addInterceptor(authHandlerInterceptor).addPathPatterns("/**");
    }
}