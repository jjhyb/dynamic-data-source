package com.yibo.controller;

import com.yibo.center.domain.entity.Share;
import com.yibo.center.domain.entity.TradeGoods;
import com.yibo.center.domain.entity.User;
import com.yibo.service.ShareService;
import com.yibo.service.TradeGoodsService;
import com.yibo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: huangyibo
 * @Date: 2020/6/10 23:38
 * @Description:
 */

@RestController
@RequestMapping("/datasource")
public class DynamicDataSourceController {

    @Autowired
    private ShareService shareService;

    @Autowired
    private UserService userService;

    @Autowired
    private TradeGoodsService tradeGoodsService;

    @GetMapping("/user/findAl1")
    public List<User> findUser(){

        return userService.findAll();
    }

    @GetMapping("/share/findAl2")
    public List<Share> findShare(){

        return shareService.findAll();
    }
    @GetMapping("/goods/findAl3")
    public List<TradeGoods> findTradeGoods(){

        return tradeGoodsService.findAll();
    }

}
