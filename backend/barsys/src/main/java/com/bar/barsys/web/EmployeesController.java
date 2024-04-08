package com.bar.barsys.web;

import com.bar.barsys.app.service.EMPCRT.EMPCRTService;
import com.bar.barsys.app.service.EMPLIINQ.EMPLIINQService;
import com.bar.barsys.domain.common.CommonRequest;
import com.bar.barsys.domain.common.ResultType;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeesController {


    public EmployeesController(EMPLIINQService empliinqService, EMPCRTService empcrtService) {
        this.empliinqService = empliinqService;
        this.empcrtService = empcrtService;
    }

    private EMPLIINQService empliinqService;
    private EMPCRTService empcrtService;


    @CrossOrigin(origins = "http://localhost:5173")
    @PostMapping(value = "/hr/{tranCode}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Object handleHrRequest(@RequestBody CommonRequest commonRequest, @PathVariable String tranCode) {

        if (tranCode.equals("empliinq")) {
            return empliinqService.execute(commonRequest);
        }

        if (tranCode.equals("empcrt")) {
            return empcrtService.execute(commonRequest);
        }
        return ResultType.FAILURE;
    }


}

