package com.cy.pj.common.dao;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

public interface GoodsDao {
    public List<Map<String,Object>> findGoods();
}
