//package com.cy.pj.goods.dao;
//
//import com.cy.pj.goods.pojo.Goods;
//import org.apache.ibatis.session.SqlSession;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public class GoodsDaoImpl implements GoodsDao{
//    @Autowired
//    private SqlSession sqlSession;
//
//    @Override
//    public List<Goods> findGoods() {
//        System.out.println("--findGoods()--");
//        String statement = "com.cy.pj.goods.dao.GoodsDao.findGoods";
//        List<Goods> list = sqlSession.selectList(statement);
//        return list;
//    }
//
//
//}
