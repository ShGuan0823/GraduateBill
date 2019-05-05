package com.njupt.ciot.graduatebill.domain;

import java.util.List;

/**
 * @Author ShGuan
 * @Description 学生实体类，用于业务逻辑
 * @Date 2019/5/5 17:55
 **/
public class Student extends BaseEntity{

    /**
     * 学号
     */
    private String stuId;

    /**
     * 姓名
     */
    private String stuName;

    /**
     * 绩点
     */
    private List<String> grade;

    /**
     * 入学年份
     */
    private String entranceYear;

    /**
     * 借阅书籍量
     */
    private Integer bookNum;

    /**
     * 学时
     */
    private String studyTime;

    /**
     * 花销
     */
    private String coust;

    /**
     * 获奖情况
     */
    private List<Award> awardList;

    /**
     * 竞赛情况
     */
    private List<Competition> compList;
}