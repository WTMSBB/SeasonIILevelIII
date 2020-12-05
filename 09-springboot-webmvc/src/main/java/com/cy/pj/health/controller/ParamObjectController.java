package com.cy.pj.health.controller;

import com.cy.pj.health.pojo.RequestParameter;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.regex.Pattern;

@RestController
public class ParamObjectController {

    @RequestMapping("/doHandleRequestparam01")
    public String doHandleRequestparam01(String name, Date date){
        return "name:"+name+"/date:"+date;
    }
    @RequestMapping("/doHandleRequestparam02")
    public String doHandleRequestparam02(String name, Date date){
        return "name:"+name+"/date:"+date;
    }
    @RequestMapping("/doHandleRequestparam03/{name}/{code}")
    public String doHandleRequestparam03(@PathVariable String name,
                                         @PathVariable Integer code){
        return "name:"+name+code;
    }
    @RequestMapping("/doHandleRequestparam04")
    public String doHandleRequestparam04(RequestParameter parameter){
        return "request params:"+parameter.toString();
    }

}
