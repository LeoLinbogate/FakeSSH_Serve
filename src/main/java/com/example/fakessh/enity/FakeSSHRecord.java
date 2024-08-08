package com.example.fakessh.enity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
@TableName("records")
public class FakeSSHRecord implements Serializable {

    private static final long serialVersionUID = 1L;

//    @TableId
//    private Long id;

    private LocalDate date;

    private LocalTime time;

    private String client;

    private String addr;

    private String username;

    private String passwd;
}