package com.bar.barsys.app.service.EMPLIINQ;

import com.bar.barsys.domain.common.CommonResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class EMPLIINQResponse extends CommonResponse {
    protected List<EMPLIINQVO> dataList;
}
