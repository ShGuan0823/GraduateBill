package com.njupt.ciot.graduatebill.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Description TODO
 * @Author ShGuan
 * @Date 2019/5/7 16:34
 **/

@Mapper
public interface LoginDao {

    String findPasswordByUsername(String username);

}
