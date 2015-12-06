package com.contribute.india.config;

import javax.annotation.Resource;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;


@Configuration
@PropertySources({
    @PropertySource(value = {"file:${CONF_DIR}/application.properties"}),
})

public class MySQLConfig {
	@Resource
    private Environment environment;

    private DataSource dataSource;

    @Bean
    public DataSource getDataSource(){
    		System.out.println("AA:"+environment.getRequiredProperty("mysql.jdbcurl"));
            this.dataSource= new DataSource();
            dataSource.setDriverClassName(environment.getRequiredProperty("mysql.driver"));
            dataSource.setUrl(environment.getRequiredProperty("mysql.jdbcurl"));
            dataSource.setUsername(environment.getRequiredProperty("mysql.user"));
            dataSource.setPassword(environment.getRequiredProperty("mysql.password"));
            return dataSource;

    }

}
