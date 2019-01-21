package com.mybatisplus.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.baomidou.mybatisplus.generator.config.PackageConfig;

@Configuration
public class AutoPackageConfig {
	@Value("${package.moduleName}")
	private String moduleName;
	@Value("${package.parent}")
	private String parent;
	@Value("${package.entityPackageName}")
	private String entityPackageName;
	
	@Bean
	public PackageConfig configPackage() {
		PackageConfig pc = new PackageConfig();
        pc.setModuleName(moduleName);
        pc.setParent(parent);
        pc.setEntity(entityPackageName);
        return pc;
	}
}
