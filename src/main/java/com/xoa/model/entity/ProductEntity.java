package com.xoa.model.entity;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "product")
public class ProductEntity extends  BaseEntity {
    @Column(name = "name")
    private String name;

    @Column(name = "cas")
    private String cas;

    @Column(name = "contain")
    private String contain;

    @Column(name ="shape")
    private String shape;

    @Column(name = "price")
    private String price;

    @Column(name = "pack")
    private String pack;

    @Column(name = "purpose")
    private String purpose;

    @Column(name = "danger")
    private Integer  danger;

    @Column(name = "suppler")
    private String suppler;
}
