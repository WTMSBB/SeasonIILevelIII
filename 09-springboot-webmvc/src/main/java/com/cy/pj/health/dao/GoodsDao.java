package com.cy.pj.health.dao;


import com.cy.pj.health.pojo.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface GoodsDao {
    List<Goods> findGoods();
}
