package com.github.hwangrq.customize.starter.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author hwangrq
 * @date 2021/2/28 19:37
 * @description
 */
@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "simplebean")
public class SimpleBean {

	private int id;
	private String name;

	@Override
	public String toString() {
		return "SimpleBean{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
