package com.mybatisplus.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

@Configuration
public class AutoStrategyConfig {
	@Value("${strategy.include}")
	private String include;
	@Value("${strategy.superEntityColumns}")
	private String superEntityColumns;
	
	@Bean
	public StrategyConfig configStrategy() {
		StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setEntityBuilderModel(true);
        strategy.setRestControllerStyle(true);
        strategy.setInclude(include);
        strategy.setSuperEntityColumns(superEntityColumns);
        strategy.setControllerMappingHyphenStyle(true);
        return strategy;
	}
}
