package com.bar.barsys.web;

import com.bar.barsys.app.service.CUSTCRT.CUSTCRTService;
import com.bar.barsys.app.service.CUSTINQ.CUSTINQService;
import com.bar.barsys.app.service.EMPCRT.EMPCRTService;
import com.bar.barsys.app.service.EMPLIINQ.EMPLIINQService;
import com.bar.barsys.domain.common.CommonRequest;
import com.bar.barsys.domain.common.ResultType;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class BarsysController {


    public BarsysController(EMPLIINQService empliinqService, EMPCRTService empcrtService, CUSTCRTService custcrtService, CUSTINQService custinqService) {
        this.empliinqService = empliinqService;
        this.empcrtService = empcrtService;
        this.custcrtService = custcrtService;
        this.custinqService = custinqService;

    }

    private EMPLIINQService empliinqService;
    private EMPCRTService empcrtService;
    private CUSTCRTService custcrtService;
    private CUSTINQService custinqService;


    @CrossOrigin(origins = "http://localhost:5173")
    @PostMapping(value = "/hr/{tranCode}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Object handleHrRequest(@RequestBody CommonRequest commonRequest, @PathVariable String tranCode) {
        return switch (tranCode) {
            case "empliinq" -> empliinqService.execute(commonRequest);
            case "empcrt" -> empcrtService.execute(commonRequest);
            default -> ResultType.FAILURE;
        };
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PostMapping(value = "/customer/{tranCode}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Object handleCustomerRequest(@RequestBody CommonRequest commonRequest, @PathVariable String tranCode) {
        return switch (tranCode) {
            case "custcrt" -> custcrtService.execute(commonRequest);
            case "custinq" -> custinqService.execute(commonRequest);
            default -> ResultType.FAILURE;
        };
    }


}

