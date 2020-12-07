package com.cy.pj.goods.controller;

import com.cy.pj.goods.pojo.Goods;
import com.cy.pj.goods.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
        List<Goods> list = goodsService.findGoods(null);
        mv.addObject("list",list);
        mv.setViewName("GoodsUI");
        return mv;
    }

    @RequestMapping("doDeleteById/{id}")
    public String doDeleteByIds(@PathVariable Integer id,Model model){
        goodsService.deleteById(id);
        List<Goods> list = goodsService.findGoods(null);
        model.addAttribute("list",list);
        return "GoodsUI";
    }

    @RequestMapping({"doFindGoods/{name}","doFindGoods/"})
    public String doFindGoods(@PathVariable(required = false) String name, Model model){
        List<Goods> list = goodsService.findGoods(name);
        model.addAttribute("list",list);
        return "GoodsUI";
    }

    @RequestMapping("doAddUI")
    public String doAddUI(){
        return "Goods-Add";
    }

    @RequestMapping("insertGoods")
    public String insertGoods(Goods goods,Model model){
        goodsService.insertGoods(goods);
        List<Goods> list = goodsService.findGoods(null);
        model.addAttribute("list",list);
        return "GoodsUI";
    }

    @RequestMapping("updateGoods")
    public String updateGoods(Goods goods,Model model){
        goodsService.updateGoods(goods);
        List<Goods> list = goodsService.findGoods(null);
        model.addAttribute("list",list);
        return "GoodsUI";
    }

    @RequestMapping("doFindById/{id}")
    public String doFindById(@PathVariable Integer id,Model model){
        Goods goods = goodsService.findById(id);
        model.addAttribute("goods",goods);
        return "Goods-Update";
    }

}
