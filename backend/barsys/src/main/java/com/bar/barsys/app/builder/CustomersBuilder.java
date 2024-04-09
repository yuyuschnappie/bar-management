package com.bar.barsys.app.builder;

import com.bar.barsys.app.service.CUSTINQ.CUSTINQResponse;
import com.bar.barsys.app.service.CUSTINQ.CUSTINQVO;
import com.bar.barsys.app.service.EMPLIINQ.EMPLIINQVO;
import com.bar.barsys.domain.common.CommonRequest;
import com.bar.barsys.domain.entity.Customers;
import com.bar.barsys.domain.entity.Employees;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomersBuilder {
    @Mapping(source = "account", target = "account")
    @Mapping(source = "ableTime", target = "ableTime")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "tel", target = "tel")
    @Mapping(source = "level", target = "level")
    @Mapping(source = "enable", target = "enable")
    public List<CUSTINQVO> entityListToCUSTINQVO(List<Customers> entityList);

    @Mapping(source = "account", target = "account")
    @Mapping(source = "ableTime", target = "ableTime")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "tel", target = "tel")
    @Mapping(source = "level", target = "level")
    @Mapping(source = "enable", target = "enable")
    public CUSTINQResponse entityToCUSTINQRes(Customers entity);

    @Mapping(source = "account", target = "account")
    @Mapping(source = "password", target = "password")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "tel", target = "tel")
    @Mapping(source = "enable", target = "enable")
    public Customers requestToEntity(CommonRequest request);
}
