package com.bar.barsys.domain.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

@ToString
@Entity
@Data
@Table(schema = "public", name = "employees")
public class Employees {
    @Id
    @Column(name = "id", length = 10)
    private String id;

    @Column(name = "name", length = 10)
    private String name;

    @Column(name = "password")
    private String password;

    @Column(name = "password_salt")
    private String passwordSalt;

    @Column(name = "level", length = 1)
    private String level;

    @Column(name = "address", length = 256)
    private String address;

    @Column(name = "tel", length = 10)
    private String tel;

    @Column(name = "create_time", insertable = false, updatable = false)
    private Date createTime;

    @Column(name = "entry_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date entryDate;

    @Column(name = "leave_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date leaveDate;

    @Column(name = "status")
    private Integer status;

    @Column(name = "create_by", length = 10)
    private String createBy;

    @Column(name = "update_time")
    private Date updateTime;

    @Column(name = "update_by", length = 10)
    private String updateBy;
}