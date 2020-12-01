package com.cy.pj.goods.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Repository
public class DefaultGoodsDao implements GoodsDao{
    @Autowired
    private DataSource dataSource;

    @Override
    public List<Map<String, Object>> findGoods() {
        Connection conn = null;
        Statement sta = null;
        ResultSet rs = null;
        try {
        conn = dataSource.getConnection();
        sta = conn.createStatement();
        rs = sta.executeQuery("select * from tb_goods");
        List<Map<String,Object>> list = new LinkedList<>();
            while (rs.next()) {
                Map<String, Object> map = new HashMap<>();
                map.put("id", rs.getInt("id"));
                map.put("name", rs.getString("name"));
                map.put("remark", rs.getString("remark"));
                map.put("createdTime", rs.getTimestamp("createdTime"));
                list.add(map);
            }
            return list;
        }catch (SQLException e){
            e.printStackTrace();
            return null;
        }finally {
            try {if (rs!=null)rs.close(); }catch (Exception e1){}
            try {if (sta!=null)sta.close();}catch (Exception e1){}
            try {if (conn!=null)conn.close();}catch (Exception e1){}
        }
    }
}
























