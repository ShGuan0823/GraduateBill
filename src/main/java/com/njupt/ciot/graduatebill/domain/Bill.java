package com.njupt.ciot.graduatebill.domain;

import lombok.Data;

/**
 * @Author ShGuan
 * @Description 报告实体类
 * @Date 2019/5/5 17:55
 **/
@Data
public class Bill extends BaseEntity{

    /**
     * 学生实体
     */
    private Student student;

    /**
     * 借阅量区间
     */
    private String bookSection;

    /**
     * 获奖区间
     */
    private String awardSection;

}