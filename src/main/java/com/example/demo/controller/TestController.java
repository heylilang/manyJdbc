package com.example.demo.controller;

import com.example.demo.entity.CoinClass;
import com.example.demo.entity.Wallets;
import com.example.demo.mapper.test.CoinClassMapper;
import com.example.demo.mapper.testTwo.WalletsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.List;

@RequestMapping("/test")
@RestController
public class TestController {

    @Autowired
    private CoinClassMapper coinClassMapper;

    @Resource
    private WalletsMapper walletsMapper;

    @RequestMapping(value = "/select",method = RequestMethod.GET)
    public void select(){
        List<CoinClass> coinClasses = coinClassMapper.selectAll();
        System.out.println(coinClasses);
    }

    @RequestMapping(value = "/select2",method = RequestMethod.GET)
    public void select2(){
        List<Wallets> wallets = walletsMapper.selectAll();
        System.out.println(wallets);
    }
}
