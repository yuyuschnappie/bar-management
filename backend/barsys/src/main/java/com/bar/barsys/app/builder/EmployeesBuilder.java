package com.bar.barsys.app.builder;

import com.bar.barsys.app.service.EMPLIINQ.EMPLIINQVO;
import com.bar.barsys.domain.common.CommonRequest;
import com.bar.barsys.domain.entity.Employees;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EmployeesBuilder {
    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "level", target = "level")
    @Mapping(source = "address", target = "address")
    @Mapping(source = "tel", target = "tel")
    @Mapping(source = "entryDate", target = "entryDate")
    @Mapping(source = "leaveDate", target = "leaveDate")
    @Mapping(source = "status", target = "status")
    public List<EMPLIINQVO> entityListToEMPLIINQVO(List<Employees> entityList);

    @Mapping(source = "name", target = "name")
    @Mapping(source = "password", target = "password")
    @Mapping(source = "level", target = "level")
    @Mapping(source = "address", target = "address")
    @Mapping(source = "tel", target = "tel")
    @Mapping(source = "entryDate", target = "entryDate")
    @Mapping(source = "leaveDate", target = "leaveDate")
    @Mapping(source = "status", target = "status")
    public Employees requestToEntity(CommonRequest request);
}
