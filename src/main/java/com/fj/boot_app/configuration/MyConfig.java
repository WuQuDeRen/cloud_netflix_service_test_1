package com.fj.boot_app.configuration;

import javax.annotation.PostConstruct;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

//@Configuration
@ConfigurationProperties(prefix = "wxpay")// 与配置文件中开头相同
//PropertySource默认取application.properties
//@PropertySource(value = "wxpay.properties")
@Data
public class MyConfig {
	private String appID;
	private String mchID;
	private String key;
	
	@PostConstruct
	public void init() {
		System.out.println();
	}
}