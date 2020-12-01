package com.cy.pj.common.datasource;

import com.cy.pj.goods.dao.GoodsDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@SpringBootTest
public class GoodsDaoTests {
    @Autowired
    private GoodsDao goodsDao;
    @Test
    public void testFindGoods() throws SQLException {
        List<Map<String,Object>> list = goodsDao.findGoods();
        for (Map<String,Object> map : list){
            System.out.println(map);
        }

    }

}
