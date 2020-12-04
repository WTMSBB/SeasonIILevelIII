package com.cy.pj.health.controller;

import com.cy.pj.health.pojo.Goods;
import com.cy.pj.health.pojo.ResponseResult;
import com.cy.pj.health.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.LinkedList;
import java.util.List;

@Controller
@RequestMapping("/")
public class TemplateController {
    @Autowired
    private GoodsService goodsService;

    @RequestMapping("doTemplateUI")
    public String doTemplateUI(Model model){
        model.addAttribute("viewName","Default");
        return "default";
    }

    @RequestMapping("doFindGoods")
    public String doFindGoods(Model model){
        List<Goods> list = goodsService.findGoods();
//        for (Goods goods:list){
//            model.addAttribute("ID",goods.getId());
//            model.addAttribute("NAME",goods.getName());
//            model.addAttribute("REMARK",goods.getRemark());
//            model.addAttribute("CREATEDTIME",goods.getCreatedTime());
//        }
        model.addAttribute("list",list);
        return "homeWork";
    }

    @RequestMapping("doModelAndView")
    public ModelAndView doModelAndView(ModelAndView mv){
        List<String> list = new LinkedList<>();
        list.add("bj");
        list.add("hz");
        list.add("sh");
        list.add("sz");
        mv.addObject("list",list);
        mv.setViewName("default");
        return mv;
    }

    @ResponseBody
    @RequestMapping("doResponseJson")
    public ResponseResult doResponseJson(){
        ResponseResult responseResult = new ResponseResult();
        responseResult.setCode(200);
        responseResult.setMessage("ok");
        return responseResult;
    }

}
