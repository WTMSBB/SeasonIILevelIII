package com.cy.pj.goods.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Repository
public class DefaultGoodsDao implements GoodsDao{
    @Autowired
    private DataSource dataSource;

    @Value("${test.sql}")
    private String sql;

    private final static Logger LOGGER = LoggerFactory.getLogger(DefaultGoodsDao.class);


    /**
     * 释放资源的方法
     * @param resultSet
     * @param statement
     * @param connection
     */
    public void close(ResultSet resultSet,Statement statement,Connection connection){
        try {if (resultSet!=null)resultSet.close(); }catch (Exception e1){}
        try {if (statement!=null)statement.close();}catch (Exception e1){}
        try {if (connection!=null)connection.close();}catch (Exception e1){}
    }

    Map<String,Object> rowMap(ResultSetMetaData resultSetMetaData,ResultSet resultSet)throws SQLException{
        Map<String,Object> map = new HashMap<>();
        for (int i=1;i<=resultSetMetaData.getColumnCount();i++)
            map.put(resultSetMetaData.getColumnName(i),resultSet.getObject(resultSetMetaData.getColumnName(i)));
        return map;
    }




    @Override
    public List<Map<String, Object>> findGoods() {
        Connection conn = null;
        Statement sta = null;
        ResultSet rs = null;
        try {
            conn = dataSource.getConnection();
            sta = conn.createStatement();
            rs = sta.executeQuery(sql);
            List<Map<String,Object>> list = new LinkedList<>();
            ResultSetMetaData resultSetMetaData = rs.getMetaData();
            while (rs.next()) {
                //列数定死
//                Map<String, Object> map = new HashMap<>();
//                map.put("id", rs.getInt("id"));
//                map.put("name", rs.getString("name"));
//                map.put("remark", rs.getString("remark"));
//                map.put("createdTime", rs.getTimestamp("createdTime"));
//                list.add(map);
                //映射方案2
                list.add(rowMap(resultSetMetaData,rs));
            }
            return list;
        }catch (SQLException e){
//            e.printStackTrace();
//            return null;
            LOGGER.info("查询异常，{}",e.getMessage());
            throw new RuntimeException("数据查询失败："+e.getMessage());
        }finally {
            close(rs,sta,conn);
        }
    }
}
























