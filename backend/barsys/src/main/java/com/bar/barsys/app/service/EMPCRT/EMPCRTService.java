package com.bar.barsys.app.service.EMPCRT;

import com.bar.barsys.app.builder.EmployeesBuilder;
import com.bar.barsys.app.service.COMMON.COMMONService;
import com.bar.barsys.domain.common.CommonRequest;
import com.bar.barsys.domain.common.ResultType;
import com.bar.barsys.domain.entity.Employees;
import com.bar.barsys.domain.service.EmployeesService;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.time.LocalDate;
import java.util.Base64;
import java.util.Random;

@Service("EMPCRTService")
public class EMPCRTService {
    private EmployeesService employeesService;
    private COMMONService commonService;

    private final EmployeesBuilder employeesBuilder = Mappers.getMapper(EmployeesBuilder.class);

    public EMPCRTService(EmployeesService employeesService, COMMONService commonService) {
        this.employeesService = employeesService;
        this.commonService = commonService;
    }

    public Object execute(CommonRequest request) {
        EMPCRTResponse response = new EMPCRTResponse();
        Employees empDto = employeesBuilder.requestToEntity(request);
        empDto.setId(createEmpId());
        empDto.setCreateBy(request.getLogin());
        String salt = commonService.salt();
        empDto.setPasswordSalt(salt);
        empDto.setPassword(commonService.hashPassword(request.getPassword(), salt));
        employeesService.createOrUpdate(empDto);

        response.setReturnCode("200");
        response.setReturnMsg("完成");
        response.setResultType(ResultType.SUCCESS);
        return response;
    }

    private String createEmpId() {

        int year = LocalDate.now().getYear() - 1911;
        String prefix = String.valueOf(year).substring(1);

        String empId;
        do {
            int randomNumber = new Random().nextInt(900) + 100;
            String randomString = String.valueOf(randomNumber);

            empId = prefix + randomString;
        } while (employeesService.findByPkId(empId).isPresent());

        return empId;
    }



}