package com.bar.barsys.app.service.CUSTCRT;

import com.bar.barsys.app.builder.CustomersBuilder;
import com.bar.barsys.app.service.COMMON.COMMONService;
import com.bar.barsys.domain.common.CommonRequest;
import com.bar.barsys.domain.common.ResultType;
import com.bar.barsys.domain.entity.Customers;
import com.bar.barsys.domain.service.CustomersService;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

@Service("CUSTCRTService")
public class CUSTCRTService {
    private CustomersService customersService;
    private COMMONService commonService;

    private final CustomersBuilder customersBuilder = Mappers.getMapper(CustomersBuilder.class);

    public CUSTCRTService(CustomersService customersService, COMMONService commonService) {
        this.customersService = customersService;
        this.commonService = commonService;
    }

    public Object execute(CommonRequest request) {
        Customers customer = customersBuilder.requestToEntity(request);
        customer.setCreateBy(request.getLogin());
        String salt = commonService.salt();
        customer.setPasswordSalt(salt);
        customer.setPassword(commonService.hashPassword(request.getPassword(), salt));
        customer.setLevel("1");
        customersService.createOrUpdate(customer);

        CUSTCRTResponse response = new CUSTCRTResponse();
        response.setReturnCode("200");
        response.setReturnMsg("完成");
        response.setResultType(ResultType.SUCCESS);
        return response;
    }
}


