package com.example.fakessh.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.fakessh.enity.FakeSSHRecord;
import com.example.fakessh.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController

public class RecordController {
    private final RecordService recordService;

    @Autowired
    public RecordController(RecordService recordService) {
        this.recordService = recordService;
    }

    //    @GetMapping("/records")
//    public IPage<FakeSSHRecord> getRecords(@RequestParam(value = "page", defaultValue = "1") int currentPage) {
//        // 调用服务层获取分页数据
//        return recordService.getRecordsWithPagination(currentPage);
//    }
    @GetMapping("/records")
    public IPage<FakeSSHRecord> getRecords(@RequestParam(value = "page", defaultValue = "1") int currentPage,
                                           @RequestParam(value = "size", defaultValue = "100") int size,
                                           @DateTimeFormat(pattern = "yyyy/MM/dd")
                                           @RequestParam(value = "startDate", defaultValue = "2000/01/01") LocalDate startDate,
                                           @DateTimeFormat(pattern = "yyyy/MM/dd")
                                           @RequestParam(value = "endDate", defaultValue = "2099/12/31") LocalDate endDate) {
        return recordService.getRecordsWithPagination(currentPage, size, startDate, endDate);
    }

    @GetMapping("/getfournum")
    public Map<String ,Integer> getFourNum(){
        return recordService.getFourIntegers();
    }
    @GetMapping("/gettoptenaddrs")
    public Map<String ,List<Map<String,Object>>> getTopTenAddrs(){
       return recordService.getTopten();
    }
}
