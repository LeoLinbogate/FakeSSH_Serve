package com.example.fakessh.service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.fakessh.enity.FakeSSHRecord;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.fakessh.mapper.RecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class RecordService {

    @Autowired
    private RecordMapper recordMapper;

    //获取全部数据
    public IPage<FakeSSHRecord> getRecordsWithPagination(int currentPage,int size,LocalDate startDate,LocalDate endDate) {
        // 创建Page对象，设置每页200条记录
        Page<FakeSSHRecord> page = new Page<>(currentPage, size);

        // 创建QueryWrapper对象，如果有特定查询条件，可以在此处添加
        QueryWrapper<FakeSSHRecord> queryWrapper = new QueryWrapper<>();
        // 示例：根据日期查询

         queryWrapper.between("date", startDate, endDate);

        // 执行分页查询
        IPage<FakeSSHRecord>resultPage = recordMapper.selectPage(page, queryWrapper);

        // 返回分页结果
        return resultPage;
    }

}
