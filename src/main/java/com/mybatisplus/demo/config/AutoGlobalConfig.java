package com.mybatisplus.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.baomidou.mybatisplus.generator.config.GlobalConfig;

@Configuration
public class AutoGlobalConfig {
	@Value("${global.root}")
	private String root;
	@Value("${global.sourcePath}")
	private String sourcePath;
	@Value("${global.author}")
	private String author;
	@Bean
	public GlobalConfig configGlobal() {
		GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir(root + sourcePath);
        gc.setAuthor(author);
        gc.setOpen(false);
        gc.setServiceName("%sService");
        gc.setServiceImplName("%sServiceImpl");
        return gc;
	}
}
