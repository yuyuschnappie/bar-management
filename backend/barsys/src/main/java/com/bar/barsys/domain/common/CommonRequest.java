package com.bar.barsys.domain.common;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Data
public class CommonRequest {
    private String tranCode;

    private String login;

    private String name;

    private String password;

    private String level;

    private String address;

    private String tel;

    @JsonFormat(pattern = "yyyy/MM/dd", timezone = "Asia/Taipei")
    private Date entryDate;

    @JsonFormat(pattern = "yyyy/MM/dd", timezone = "Asia/Taipei")
    private Date leaveDate;

    private Integer status;

    private String account;

    private Boolean enable = false;

    @JsonFormat(pattern = "yyyy/MM/dd", timezone = "Asia/Taipei")
    private Date ableTime;
}
