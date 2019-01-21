package com.mybatisplus.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.baomidou.mybatisplus.generator.config.TemplateConfig;

@Configuration
public class AutoTemplateConfig {

	@Bean
	public TemplateConfig configTemplate() {
		TemplateConfig templateConfig = new TemplateConfig();
		templateConfig.setXml(null);
		return templateConfig;
	}
}
