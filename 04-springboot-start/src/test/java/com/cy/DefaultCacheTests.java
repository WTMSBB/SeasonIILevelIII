package com.cy;

import com.cy.pj.common.cache.DefaultCache;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DefaultCacheTests {
    @Autowired
    private DefaultCache defaultCache;
    @Test
    void hasautowired(){
        System.out.println(defaultCache);
    }
}
