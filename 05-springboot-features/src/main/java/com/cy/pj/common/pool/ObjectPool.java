package com.cy.pj.common.pool;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class ObjectPool {

    public ObjectPool(){
        System.out.println("Paramless Constructor");
    }
    
}
