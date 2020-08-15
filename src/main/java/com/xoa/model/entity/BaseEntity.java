package com.xoa.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Setter
@Getter
public abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Integer id;

    @Column(name = "creator")
    private String creator;

    @Column(name="updater")
    private String updater;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name ="update_time")
    private Date updateTime;

    @Column(name = "description")
    private String description;
}
