package com.example.fakessh.controller;

import com.example.fakessh.enity.Logs;
import com.example.fakessh.service.HisLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@RestController
public class HisLogController {
    private final HisLogService hisLogService;
    @Autowired
    public HisLogController(HisLogService hisLogService){this.hisLogService=hisLogService;}

    @GetMapping("/logs")
    public List<Logs> logList(
            @DateTimeFormat(pattern = "yyyy/MM/dd")
                                @RequestParam(value = "startDate",defaultValue = "2024/01/01") LocalDate startDateStr,
            @DateTimeFormat(pattern = "yyyy/MM/dd")
            @RequestParam(value = "endDate" ,defaultValue = "2099/12/31") LocalDate endDateStr) throws ParseException {

        return hisLogService.findLogByDate(startDateStr, endDateStr);
    }
}
