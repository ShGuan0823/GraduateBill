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
     * 奖项id
     */
    private String awardId;
    /**
     * 奖项名
     */
    private String awardName;
    /**
     * 获奖时间
     */
    private Date awardTime;
}