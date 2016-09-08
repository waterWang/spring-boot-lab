package com.github.water.boot.rest.v1;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import javax.servlet.http.HttpSession;

//import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;

/**
 * water
 * 
 * @Controller：修饰class，用来创建处理http请求的对象
 * @RestController：Spring4之后加入的注解，
 * 原来在@Controller中返回json需要@ResponseBody来配合， 如果直接用@RestController替代@Controller就不需要再配置@ResponseBody，
 *                                                                         默认返回json格式。 @RequestMapping
 *                                                                         ：
 *                                                                         配置url映射
 */
@RestController
@RequestMapping(value = "/users")
public class HellowResource {

	@RequestMapping("/hello")
	@ResponseBody
	public String hellow() {

		return "哈喽3，Spring Boot ！";
	}

//	@RequestMapping(value = "/add", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
//	@ApiOperation(httpMethod = "POST", value = "给已购买的课程分配老师", response = Void.class, notes = "给已购买的课程分配老师<br><br><b>@author Rigel.ma</b>")
//	public ResponseEntity<String> addTeacher(
//			@ApiParam(value = "") @RequestBody String domain,
//			@RequestHeader("Authorization") String token, HttpSession session) {
//
//			return new ResponseEntity<String>("wwwwwww",	HttpStatus.EXPECTATION_FAILED);
//	}

}