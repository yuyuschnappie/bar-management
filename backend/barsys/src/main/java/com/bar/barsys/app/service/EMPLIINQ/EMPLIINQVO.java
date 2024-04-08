package com.bar.barsys.app.service.EMPLIINQ;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.Date;

@Data
public class EMPLIINQVO {
    @Schema(name = "id", description = "員工編號", example = "")
    protected String id;

    @Schema(name = "name", description = "員工姓名", example = "")
    protected String name;

    @Schema(name = "level", description = "權等", example = "")
    protected String level;

    @Schema(name = "address", description = "地址", example = "")
    protected String address;

    @Schema(name = "tel", description = "電話", example = "")
    protected String tel;

    @Schema(name = "entryDate", description = "入值日", example = "")
    @JsonFormat(pattern = "yyyy/MM/dd")
    protected Date entryDate;

    @Schema(name = "status", description = "在職狀態", example = "")
    private Integer status;

    @Schema(name = "leaveDate", description = "離職日", example = "")
    @JsonFormat(pattern = "yyyy/MM/dd")
    protected Date leaveDate;

}
