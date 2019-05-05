package com.njupt.ciot.graduatebill.domain;

import lombok.Data;
import java.io.Serializable;
import java.util.Date;

/**
 * @Author ShGuan
 * @Description 基础实体类
 * @Date 2019/5/5 17:56
 **/

@Data
public class BaseEntity implements Serializable{

    private String id;

    private Date cmt;

    private Date gmt;

    public void preSave() {
        this.gmt = new Date();
        this.cmt = this.gmt;
    }

    public void preUpdate() {
        this.gmt = new Date();
    }

}