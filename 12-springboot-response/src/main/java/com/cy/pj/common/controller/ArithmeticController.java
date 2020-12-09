package com.cy.pj.common.controller;

import com.cy.pj.common.pojo.ResponseResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Min;

@RestController
@Validated
public class ArithmeticController {

    @RequestMapping("/doCompute/{n1}/{n2}")
    public ResponseResult doCompute(@PathVariable Integer n1,@PathVariable Integer n2){
        Integer result = n1/n2;
        return new ResponseResult("result is" +result);
    }

    @RequestMapping("/doCompute/{n1}/{n2}")
    public ResponseResult doCompute2(@PathVariable Integer n1,@PathVariable @Min(1) Integer n2){
        Integer result = n1/n2;
        return new ResponseResult("result is" +result);
    }
}
