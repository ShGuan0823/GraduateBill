package com.njupt.ciot.graduatebill.domain;


import lombok.Data;

@Data
public class Grade extends BaseEntity{

    private String name;

    private String stuId;

    private String term_one;

    private String term_two;

    private String term_three;

    private String term_five;

    private String term_six;

    private String term_seven;

    private String term_eight;

    private String term_nine;

    private String term_ten;

    private String term_eleven;

    private String total;

    private String credit;

    private int rank;

}
