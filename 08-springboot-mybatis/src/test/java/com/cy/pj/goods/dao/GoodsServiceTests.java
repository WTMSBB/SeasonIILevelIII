package com.cy.pj.goods.dao;

import com.cy.pj.goods.pojo.Goods;
import com.cy.pj.goods.service.GoodsService;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

@SpringBootTest
public class GoodsServiceTests {
    @Autowired
    private GoodsService goodsService;

    private Logger log = LoggerFactory.getLogger(GoodsServiceTests.class);

    @Test
    void logTest(){
        log.trace("test log trace");
        log.info("test log info");
        log.debug("test log debug");
        log.error("test log error");

    }

    @Test
    void testFindGoods(){
        List<Goods> list = goodsService.findObjects();
        for (Goods g:list)
            System.out.println(g);
    }
    @Test
    void deleteObjectTest(){
        System.out.println(goodsService.deleteById(1));
    }
    @Test
    void deleteObjectsTest(){
        System.out.println(goodsService.deleteByIds());
    }
}
