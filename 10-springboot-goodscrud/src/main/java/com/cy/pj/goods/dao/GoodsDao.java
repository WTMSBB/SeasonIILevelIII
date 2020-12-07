package com.cy.pj.goods.dao;

import com.cy.pj.goods.pojo.Goods;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoodsDao {

    List<Goods> findGoods(String name);

    @Delete("DELETE FROM tb_goods WHERE id=#{id}")
    int deleteById(Integer id);

    void updateGoodsById(Integer id,String name,String remark);

    void insertGoods(Integer id,String name,String remark);

}
