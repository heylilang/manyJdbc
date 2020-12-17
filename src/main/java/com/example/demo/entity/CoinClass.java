package com.example.demo.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class CoinClass implements Serializable {

    private Long id;
    private String name;
    private String imgUrl;
    private Byte isHot;
    private Byte coinType;
    private String doubleCoinClassIds;
    private Date createTime;
    private Date updateTime;
    private Byte isDelete;

    private static final long serialVersionUID = 1L;
}