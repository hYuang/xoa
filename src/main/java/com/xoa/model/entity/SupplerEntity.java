package com.xoa.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Table;

@Setter
@Getter
@Table(name = "suppler")
public class SupplerEntity extends  BaseEntity {
    @Column(name = "suppler_name")
    private String supplerName;

    @Column(name ="account_no")
    private String accountNo;

    @Column(name ="account_type")
    private String accountType;

    @Column(name ="contact")
    private String contact;

    @Column(name = "cellphone")
    private String cellPhone;

    @Column(name = "telephone")
    private String telephone;

    @Column(name ="qq")
    private String qq;

    @Column(name ="bank_name")
    private String bankName;

    @Column(name = "email")
    private String email;

    @Column(name = "name")
    private String name;
}
