package com.njupt.ciot.graduatebill.domain;

import lombok.Data;

import java.util.List;

/**
 * @Author ShGuan
 * @Description 学生实体类，用于业务逻辑
 * @Date 2019/5/5 17:55
 **/
@Data
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
    private Grade grade;

//    /**
//     * 入学年份
//     */
//    private String entranceYear;

    private String CET4;

    private String CET6;

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
    private List<String> counstList;

    /**
     * 获奖情况
     */
    private List<Award> awardList;

    /**
     * 等级考试情况
     */
    private List<String> levelExamList;
}