package com.github.water.boot.rest.v1;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.water.boot.domain.TestDTO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import java.util.HashMap;
import java.util.Map;

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
 * @RestController：Spring4之后加入的注解， 原来在@Controller中返回json需要@ResponseBody来配合，
 *                                 如果直接用@RestController替代@Controller就不需要再配置@ResponseBody，
 *                                 默认返回json格式。 @RequestMapping ： 配置url映射
 */
@RestController
@RequestMapping(value = "/api/web/v1/schedule")
@Api(value = "任务调度", description = "任务调度api")
public class HellowResource {

	// @RequestMapping("/hello")
	// @ResponseBody
	// public String hellow() {
	//
	// return "哈喽3，Spring Boot ！";
	// }

	@RequestMapping(value = "/add", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(httpMethod = "POST", value = "添加调度任务", response = Void.class, notes = "给某个场景添加调度任务<br><br><b>@author 王伟伟</b>")
	public ResponseEntity<Map<String, Object>> addTeacher(@ApiParam(value = "调度DTO") @RequestBody TestDTO testDTO) {
			
		Map<String, Object> result = new HashMap<String, Object>();
			if (null != testDTO.getId() ) {
				result.put("1", Boolean.TRUE);
				return new ResponseEntity<Map<String, Object>>(result, HttpStatus.OK);
			} else {
				result.put("2", Boolean.FALSE);
				return new ResponseEntity<Map<String, Object>>(result,	HttpStatus.EXPECTATION_FAILED);
			}
	}

}