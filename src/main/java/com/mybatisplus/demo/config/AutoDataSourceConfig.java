package com.mybatisplus.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.baomidou.mybatisplus.generator.config.DataSourceConfig;

@Configuration
public class AutoDataSourceConfig {
	@Value("${dataSource.url}")
	private String url;
	@Value("${dataSource.driver}")
	private String driver;
	@Value("${dataSource.userName}")
	private String userName;
	@Value("${dataSource.password}")
	private String password;
	
	@Bean
	public DataSourceConfig configDataSource() {
		DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl(url);
        // dsc.setSchemaName("public");
        dsc.setDriverName(driver);
        dsc.setUsername(userName);
        dsc.setPassword(password);
        return dsc;
	}
}
