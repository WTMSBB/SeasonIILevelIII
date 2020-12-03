package com.cy.pj.health.service;

import com.cy.pj.health.dao.GoodsDao;
import com.cy.pj.health.pojo.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService{

    @Autowired
    private GoodsDao goodsDao;

    @Override
    public List<Goods> findGoods() {
        return goodsDao.findGoods();
    }
}
