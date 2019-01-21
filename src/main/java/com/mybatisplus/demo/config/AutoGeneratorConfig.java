package com.mybatisplus.demo.config;

import javax.annotation.Resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.TemplateConfig;

@Configuration
public class AutoGeneratorConfig {
	@Resource
	private GlobalConfig gc;
	@Resource
	private DataSourceConfig dsc;
	@Resource
	private PackageConfig pc;
	@Resource
	private StrategyConfig strategy;
	@Resource
	private TemplateConfig templateConfig ;
	
	@Bean
	public AutoGenerator configAutoGenerator() {
		AutoGenerator mpg = new AutoGenerator();
		mpg.setGlobalConfig(gc);
		mpg.setDataSource(dsc);
		mpg.setStrategy(strategy);
		mpg.setPackageInfo(pc);
		mpg.setTemplate(templateConfig);
		mpg.execute();
		return mpg;
	}
}
