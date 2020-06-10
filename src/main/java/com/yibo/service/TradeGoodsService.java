package com.yibo.service;

import com.yibo.center.domain.entity.TradeGoods;
import com.yibo.datasource.anno.TargetDataSource;
import com.yibo.mapper.TradeGoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: huangyibo
 * @Date: 2020/6/11 0:23
 * @Description:
 */

@Service
public class TradeGoodsService {

    @Autowired
    private TradeGoodsMapper tradeGoodsMapper;

    @TargetDataSource(name = "ds2")
    public List<TradeGoods> findAll(){
        return tradeGoodsMapper.selectAll();
    }
}
