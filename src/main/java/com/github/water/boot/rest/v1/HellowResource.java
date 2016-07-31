package com.github.water.boot.rest.v1;

import org.springframework.web.bind.annotation.RequestMapping;   
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;   
  
/**  
 * water
 */  
@RestController  
public class HellowResource {   
  
  
  
    @RequestMapping("/hello")   
    @ResponseBody  
    public String hellow(){   
  
        return "哈喽3，Spring Boot ！";   
    }   
}  