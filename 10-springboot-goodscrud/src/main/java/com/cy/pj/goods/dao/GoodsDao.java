package com.cy.pj.goods.dao;

import com.cy.pj.goods.pojo.Goods;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface GoodsDao {

    List<Goods> findGoods(String name);

    @Delete("DELETE FROM tb_goods WHERE id=#{id}")
    int deleteById(Integer id);

    @Insert("INSERT INTO tb_goods (name,remark,createdTime) VALUES(#{name},#{remark},now())")
    void insertGoods(Goods goods);

    @Select("SELECT * FROM tb_goods WHERE id=#{id}")
    Goods findById(Integer id);

    @Update("UPDATE tb_goods SET name=#{name},remark=#{remark} WHERE id=#{id}")
    void updateGoods(Goods goods);
}
