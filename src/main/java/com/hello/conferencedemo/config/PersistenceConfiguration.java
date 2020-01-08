package com.hello.conferencedemo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfiguration {
    //@Value("${DB_URL}")
    //private String dbUrl;
    //@Value("${DB_NAME}")
    //private String dbName;
    //@Value("${DB_PASS}")
    //private String dbPass;

    //@Bean
    //public DataSource dataSource() {
    //    DataSourceBuilder builder = DataSourceBuilder.create();
    //    builder.url(dbUrl);
    //    builder.username(dbName);
    //    builder.password(dbPass);
    //    System.out.println("Built persistent build");
    //    return builder.build();
    //}
}
