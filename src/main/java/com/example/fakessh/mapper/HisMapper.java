package com.example.fakessh.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.fakessh.enity.FakeSSHRecord;
import com.example.fakessh.enity.Logs;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface HisMapper extends BaseMapper<Logs>{

}
