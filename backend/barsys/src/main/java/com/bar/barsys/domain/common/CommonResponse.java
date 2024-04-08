package com.bar.barsys.domain.common;

import lombok.Data;

@Data
public class CommonResponse {
    protected String returnCode;
    protected String returnMsg;
    protected ResultType resultType;
}
