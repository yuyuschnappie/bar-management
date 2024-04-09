package com.bar.barsys.app.service.CUSTINQ;

import com.bar.barsys.domain.common.CommonResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class CUSTINQResponse extends CommonResponse {
    @Schema(name = "account", description = "帳號", example = "")
    protected String account;

    @Schema(name = "name", description = "顧客姓名", example = "")
    protected String name;

    @Schema(name = "level", description = "會員等級", example = "")
    protected String level;

    @Schema(name = "enable", description = "啟用狀態", example = "")
    protected Boolean enable;

    @Schema(name = "tel", description = "聯絡電話", example = "")
    protected String tel;

    @Schema(name = "ableTime", description = "帳戶啟用時間", example = "")
    protected String ableTime;
}
