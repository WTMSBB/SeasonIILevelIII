package com.cy;

import com.cy.pj.health.pojo.Goods;
import com.cy.pj.health.service.GoodsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ttt {
    @Autowired
    private GoodsService goodsService;

    @Test
    void test(){
        List<Goods> list = goodsService.findGoods();
        for (Goods g:list)
            System.out.println(g);
    }

}
