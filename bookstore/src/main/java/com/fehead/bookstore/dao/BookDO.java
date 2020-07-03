package com.fehead.bookstore.dao;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author Nightessss 2020/7/1 8:16
 */
@TableName("book")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDO {

    public static final int SOLD_OUT = 0;

    @TableId(type = IdType.INPUT)
    private String bookId;
    private String bookName;
    private String bookAuthor;
    private String bookImg;
    private BigDecimal bookPrice;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date bookUpTime;
    private String bookPublisher;
    private Integer bookSold;
    private Integer bookRemain;
    private String bookIntro;
}
