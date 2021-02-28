package com.github.hwangrq.customize.starter.config;

import com.github.hwangrq.customize.starter.pojo.SimpleBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author hwangrq
 * @date 2021/2/28 19:40
 * @description 自动配置类
 */
@Configuration
public class MyAutoConfiguration {

	static {
		System.out.println("MyAutoConfiguration start ... ");
	}

	@Bean
	public SimpleBean simpleBean() {
		return new SimpleBean();
	}
}
