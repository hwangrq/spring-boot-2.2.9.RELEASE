package com.github.hwangrq.springbootmytest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hwangrq
 * @date 2021/2/28 3:48
 * @description
 */
@RestController
public class TestController {

	@RequestMapping("/test")
	public String test(){
		System.out.println("源码环境搭建完成");
		return "源码环境搭建完成";
	}

}
