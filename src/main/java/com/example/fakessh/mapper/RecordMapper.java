package com.example.fakessh.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.fakessh.enity.FakeSSHRecord;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RecordMapper extends BaseMapper<FakeSSHRecord>{

}
