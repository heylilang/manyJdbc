package com.example.demo.mapper.testTwo;

import com.example.demo.entity.Wallets;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WalletsMapper {

    List<Wallets> selectAll();

}