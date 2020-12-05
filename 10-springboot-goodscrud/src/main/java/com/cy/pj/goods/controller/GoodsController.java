package com.cy.pj.goods.controller;

import com.cy.pj.goods.pojo.Goods;
import com.cy.pj.goods.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    @RequestMapping("doGoodsUI")
    public ModelAndView doGoodsUI(ModelAndView mv){
        List<Goods> list = goodsService.findGoods();
        mv.addObject("list",list);
        mv.setViewName("GoodsUI");
        return mv;
    }

    @RequestMapping("doDeleteByIds/{ids}")
    public String doDeleteByIds(@PathVariable Integer... ids){
        goodsService.deleteByIds(ids);
        return " ";
    }

}
