package com.bar.barsys.domain.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

@ToString
@Entity
@Data
@Table(schema = "public", name = "customers")
public class Customers {
    @Id
    @Column(name = "account", length = 256)
    private String account;

    @Column(name = "password")
    private String password;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "tel", length = 10)
    private String tel;

    @Column(name = "level", length = 1)
    private String level;

    @Column(name = "enable")
    private Boolean enable;

    @Column(name = "password_salt")
    private String passwordSalt;

    @Column(name = "able_time", updatable = false)
    private Date ableTime;

    @Column(name = "create_time", insertable = false, updatable = false)
    private Date createTime;

    @Column(name = "create_by", length = 10)
    private String createBy;

    @Column(name = "update_time")
    private Date updateTime;

    @Column(name = "update_by", length = 10)
    private String updateBy;
}