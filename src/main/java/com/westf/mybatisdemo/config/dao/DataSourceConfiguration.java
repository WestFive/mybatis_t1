package com.westf.mybatisdemo.config.dao;


import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.westf.mybatisdemo.properties.JdbcConfigProperties;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.beans.PropertyVetoException;

@Configuration
///配置mybatis mapper的扫描路径
@MapperScan("com.westf.mybatisdemo.dao")
public class DataSourceConfiguration {


    @Autowired
    JdbcConfigProperties jdbcConfigProperties;

    @Bean(name = "dataSource")
    public ComboPooledDataSource createDataSource() throws PropertyVetoException{
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass(jdbcConfigProperties.getDriver());
        dataSource.setJdbcUrl(jdbcConfigProperties.getUrl());
        dataSource.setUser(jdbcConfigProperties.getUsername());
        dataSource.setPassword(jdbcConfigProperties.getPassword());
        dataSource.setAutoCommitOnClose(false);//连接池关闭不自动提交
        return dataSource;

    }
}
