package com.njupt.ciot.graduatebill.domain;

import lombok.Data;

import java.util.Date;

/**
 * @Author ShGuan
 * @Description 竞赛实体类
 * @Date 2019/5/5 17:56
 **/
@Data
public class Competition extends BaseEntity{
    /**
     * 竞赛id
     */
    private String compId;
    /**
     * 竞赛名
     */
    private String compName;
    /**
     * 竞赛时间
     */
    private Date compTime;
}