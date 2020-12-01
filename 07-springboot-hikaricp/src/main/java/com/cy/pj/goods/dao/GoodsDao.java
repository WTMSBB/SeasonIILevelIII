package com.cy.pj.goods.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface GoodsDao {
    public List<Map<String,Object>> findGoods() throws SQLException;
}
