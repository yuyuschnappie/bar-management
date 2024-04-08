package com.bar.barsys.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString;

@ToString
@Entity
@Data
@Table(schema = "public", name = "sys_setting")
public class SysSetting {

    @Column(name = "remark")
    private String remark;

    @Column(name = "emp_status")
    private String empStatus;

    @Id
    @Column(name = "category")
    private String category;

    @Column(name = "emp_id_value")
    private String empIdValue;

}