package com.njupt.ciot.graduatebill.domain;

import lombok.Data;

import java.util.Date;

/**
 * @Author ShGuan
 * @Description 奖项实体类
 * @Date 2019/5/5 17:56
 **/

@Data
public class Award extends BaseEntity {
    /**
     * 奖项名
     */
    private String name;
    /**
     * 获奖时间
     */
    private String year;
    /**
     * 等级
     */
    private String level;
    /**
     * 结果
     */
    private String grade;
    /**
     * 学生
     */
    private String stuName;
    /**
     * 学号
     */
    private String stuId;

}