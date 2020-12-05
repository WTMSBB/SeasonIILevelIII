package com.cy.pj.goods.service;


import com.cy.pj.goods.pojo.Goods;

import java.util.List;

public interface GoodsService {
    List<Goods> findGoods();
    int deleteByIds(Integer... ids);
}
