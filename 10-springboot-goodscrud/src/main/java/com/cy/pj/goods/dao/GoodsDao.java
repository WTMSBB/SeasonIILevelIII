package com.cy.pj.goods.dao;

import com.cy.pj.goods.pojo.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoodsDao {
    List<Goods> findGoods();

    int deleteByIds(Integer... ids);



}
