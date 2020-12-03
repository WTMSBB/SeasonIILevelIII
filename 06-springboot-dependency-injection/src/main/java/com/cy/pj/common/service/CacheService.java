package com.cy.pj.common.service;

import com.cy.pj.common.cache.Cache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CacheService {

    private Cache cache;

//    @Autowired
//    public CacheService(@Qualifier("softCache") Cache cache) {
//        this.cache = cache;
//    }

    @Autowired
    public void setCache(@Qualifier("softCache") Cache cache) {
        this.cache = cache;
    }

    public Cache getCache() {
        return cache;
    }
}
