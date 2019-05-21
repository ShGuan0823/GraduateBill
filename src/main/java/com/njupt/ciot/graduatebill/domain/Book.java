package com.njupt.ciot.graduatebill.domain;

import lombok.Data;

@Data
public class Book extends BaseEntity {

    private String stuId;

    private String name;

    private int borrowNum;

    private double rank;

    public Book preShow(Book book) {
        this.rank = book.rank * 100 / 300;
        return book;
    }

}
