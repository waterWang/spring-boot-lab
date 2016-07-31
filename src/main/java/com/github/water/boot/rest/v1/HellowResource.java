package com.github.water.boot.rest.v1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * water
 * 
 * @Controller：修饰class，用来创建处理http请求的对象
 * @RestController：Spring4之后加入的注解，原来在@Controller中返回json需要@ResponseBody来配合，
 * 如果直接用@RestController替代@Controller就不需要再配置@ResponseBody，
 * 默认返回json格式。 @RequestMapping：配置url映射
 */
@RestController
public class HellowResource {

	@RequestMapping("/hello")
	@ResponseBody
	public String hellow() {

		return "哈喽3，Spring Boot ！";
	}
}