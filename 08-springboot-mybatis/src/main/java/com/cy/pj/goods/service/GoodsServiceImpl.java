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
    public List<Goods> findObjects() {
        return goodsDao.findGoods();
    }

    @Override
    public int deleteById(Integer id) {
        if(id==null||id<1)
            throw new IllegalArgumentException("传入的ID值不合法");//继承了RuntimeException
        int rows=goodsDao.deleteById(id);
        return rows;
    }

    @Override
    public int deleteByIds(Integer... ids) {
        for (Integer id:ids) {
            if (id==null||id < 1)
                throw new IllegalArgumentException(id+"号ID值不合法");//继承了RuntimeException
        }
        return goodsDao.deleteByIds(ids);
    }
}
