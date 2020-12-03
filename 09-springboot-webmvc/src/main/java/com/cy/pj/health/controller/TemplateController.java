package com.cy.pj.health.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TemplateController {

    @RequestMapping("/doTemplateUI")
    public String doTemplateUI(){
        return "default";
    }

}
