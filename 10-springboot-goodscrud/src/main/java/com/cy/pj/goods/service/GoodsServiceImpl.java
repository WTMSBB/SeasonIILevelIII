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
    public List<Goods> findGoods(String name) {
        return goodsDao.findGoods(name);
    }

    @Override
    public int deleteById(Integer id) {
        return goodsDao.deleteById(id);
    }

    @Override
    public void updateGoodsById(Integer id, String name, String remark) {

    }

    @Override
    public void insertGoods(Integer id, String name, String remark) {

    }
}
