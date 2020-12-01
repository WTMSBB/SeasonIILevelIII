package com.cy.pj.common.datasource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootTest
public class DataSourceTest {
    @Autowired
    private DataSource dataSource;
    @Test
    void testGetConnection() throws SQLException {
        System.out.println(dataSource.getConnection());

    }
}
