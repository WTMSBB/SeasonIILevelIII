package com.cy.pj.common.ttt;

import com.cy.pj.common.dao.GoodsDao;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Connection;
import java.util.List;
import java.util.Map;

@SpringBootTest
public class ttt {
    @Autowired
    private GoodsDao goodsDao;

    @Autowired
    private SqlSession sqlSession;

    @Test
    public void ttttt(){
        Connection connection = sqlSession.getConnection();
        System.out.println(connection);
    }

}
