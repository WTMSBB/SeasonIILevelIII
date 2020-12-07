package com.cy.pj.goods.service;


import com.cy.pj.goods.pojo.Goods;

import java.util.List;

public interface GoodsService {
    List<Goods> findGoods(String name );
    int deleteById(Integer id);
    void updateGoodsById(Integer id,String name,String remark);
    void insertGoods(Integer id,String name,String remark);
}
