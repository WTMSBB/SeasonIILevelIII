package com.cy.pj.goods.service;

import com.cy.pj.goods.dao.GoodsDao;
import com.cy.pj.goods.pojo.Goods;
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

    @Override
    public int deleteByIds(Integer... ids) {
        return goodsDao.deleteByIds(ids);
    }
}
