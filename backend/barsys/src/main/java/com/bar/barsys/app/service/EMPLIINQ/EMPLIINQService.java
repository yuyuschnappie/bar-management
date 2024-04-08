package com.bar.barsys.app.service.EMPLIINQ;

import com.bar.barsys.app.builder.EmployeesBuilder;
import com.bar.barsys.domain.common.CommonRequest;
import com.bar.barsys.domain.common.ResultType;
import com.bar.barsys.domain.service.EmployeesService;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

@Service("EMPLIINQService")
public class EMPLIINQService {
    private EmployeesService employeesService;


    private final EmployeesBuilder employeesBuilder = Mappers.getMapper(EmployeesBuilder.class);

    public EMPLIINQService(EmployeesService employeesService) {
        this.employeesService = employeesService;
    }

    public Object execute(CommonRequest request) {
        EMPLIINQResponse response = new EMPLIINQResponse();
        response.setDataList(employeesBuilder.entityListToGETALLEMPVO(employeesService.findAll()));

        response.setReturnCode("200");
        response.setReturnMsg("完成");
        response.setResultType(ResultType.SUCCESS);
        return response;
    }
}


