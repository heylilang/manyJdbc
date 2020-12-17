package com.example.demo.mapper.test;

import com.example.demo.entity.CoinClass;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CoinClassMapper {

    List<CoinClass> selectAll();

}