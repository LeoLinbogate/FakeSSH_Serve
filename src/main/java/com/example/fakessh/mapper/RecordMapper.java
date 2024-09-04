package com.example.fakessh.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.fakessh.enity.FakeSSHRecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface RecordMapper extends BaseMapper<FakeSSHRecord>{
    @Select("SELECT COUNT(DISTINCT addr) AS unique_addrs_count FROM records")
    int countDistinctAddrs();
    @Select("SELECT COUNT(DISTINCT username) AS unique_usernames_count FROM records")
    int countDistinctUsernames();
    @Select("SELECT COUNT(DISTINCT passwd) AS unique_passwds_count FROM records")
    int countDistinctPasswds();
    @Select("SELECT COUNT(*) FROM records")
    int countTotalNum();
}
