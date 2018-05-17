package com.westf.mybatisdemo.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties("westfive.sessionfactory")
@Configuration
public class SessionFactoryConfiProperties {

    private String mybatis_config_filepath;
    private String mapper_path;
    private String entity_package;

    public String getMybatis_config_filepath() {
        return mybatis_config_filepath;
    }

    public void setMybatis_config_filepath(String mybatis_config_filepath) {
        this.mybatis_config_filepath = mybatis_config_filepath;
    }

    public String getMapper_path() {
        return mapper_path;
    }

    public void setMapper_path(String mapper_path) {
        this.mapper_path = mapper_path;
    }

    public String getEntity_package() {
        return entity_package;
    }

    public void setEntity_package(String entity_package) {
        this.entity_package = entity_package;
    }

}
