package com.bar.barsys.app.service.CUSTINQ;

import com.bar.barsys.app.builder.CustomersBuilder;
import com.bar.barsys.domain.common.CommonRequest;
import com.bar.barsys.domain.common.ResultType;
import com.bar.barsys.domain.entity.Customers;
import com.bar.barsys.domain.service.CustomersService;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service("CUSTINQService")
public class CUSTINQService {
    private CustomersService customersService;

    private final CustomersBuilder customersBuilder = Mappers.getMapper(CustomersBuilder.class);

    public CUSTINQService(CustomersService customersService) {
        this.customersService = customersService;
    }

    public Object execute(CommonRequest request) {
        Optional<Customers> customerOpt = customersService.findByPkAccount(request.getAccount());
        CUSTINQResponse response = new CUSTINQResponse();

        if (customerOpt.isPresent()) {
            response = customersBuilder.entityToCUSTINQRes(customerOpt.get());
        }

        response.setReturnCode("200");
        response.setReturnMsg("完成");
        response.setResultType(ResultType.SUCCESS);
        return response;
    }
}


