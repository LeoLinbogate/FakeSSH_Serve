package com.example.fakessh.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.fakessh.enity.Logs;
import com.example.fakessh.mapper.HisMapper;
import com.example.fakessh.mapper.RecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class HisLogService extends ServiceImpl<HisMapper, Logs> {
    @Autowired
    private HisMapper hisMapper;

    public List<Logs> findLogByDate(LocalDate startDate, LocalDate  endDate){
        QueryWrapper<Logs> queryWrapper = new QueryWrapper<>();
        queryWrapper.between("hdate",startDate,endDate);
        return list(queryWrapper);
    }
}
