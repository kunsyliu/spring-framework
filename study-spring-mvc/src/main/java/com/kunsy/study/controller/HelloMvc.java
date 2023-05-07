package com.kunsy.study.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kunsy/spring/mvc/")
public class HelloMvc {
	@RequestMapping("hello")
	public String hello(){
		return "success";
	}
}
