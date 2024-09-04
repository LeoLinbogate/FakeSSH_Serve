package com.example.fakessh.enity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@Data
@TableName("history_log")
public class Logs implements Serializable {
    private static final long serialVersionUID = 1L;
    //    @TableId
//    private Integer hid;
    private LocalDate hdate;
    private Integer hcount;
}
