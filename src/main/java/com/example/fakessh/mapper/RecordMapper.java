package com.example.fakessh.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.fakessh.enity.FakeSSHRecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

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
    @Select("SELECT addr, COUNT(*) as count FROM records GROUP BY addr ORDER BY count DESC LIMIT 10")
    List<Map<String, Object>> addrTopTen();
    @Select("SELECT username, COUNT(*) as count FROM records GROUP BY username ORDER BY count DESC LIMIT 10")
    List<Map<String, Object>> userTopTen();
    @Select("SELECT passwd, COUNT(*) as count FROM records GROUP BY passwd ORDER BY count DESC LIMIT 10")
    List<Map<String, Object>> passTopTen();
}
