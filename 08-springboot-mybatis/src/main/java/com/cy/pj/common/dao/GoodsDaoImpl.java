package com.cy.pj.common.dao;

import org.apache.ibatis.jdbc.SQL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
@Repository
public class GoodsDaoImpl implements GoodsDao{
    @Autowired
    private DataSource dataSource;

    private Map<String,Object> rowMap(ResultSetMetaData resultSetMetaData,ResultSet resultSet) throws SQLException {
        Map<String,Object> map = new HashMap<>();
        for (int i=1;i<=resultSetMetaData.getColumnCount();i++)
            map.put(resultSetMetaData.getColumnName(i),resultSet.getObject(resultSetMetaData.getColumnName(i)));
        return map;
    }

    public void close(ResultSet resultSet,Statement statement,Connection connection){
        try { if (resultSet!=null)resultSet.close();}catch (SQLException e1){}
        try { if (statement!=null)statement.close();}catch (SQLException e1){}
        try { if (connection!=null)connection.close();}catch (SQLException e1){}
    }


    @Override
    public List<Map<String, Object>> findGoods() {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        List<Map<String, Object>> list = new LinkedList<>();
        try {
        connection = dataSource.getConnection();
        statement = connection.createStatement();
        resultSet = statement.executeQuery("select * from tb_goods");
        ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
        while (resultSet.next())
            list.add(rowMap(resultSetMetaData,resultSet));
        return list;
        }catch (SQLException e){
            return null;
        }finally {
            close(resultSet,statement,connection);
        }
    }
}
