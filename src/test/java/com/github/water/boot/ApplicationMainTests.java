//package com.github.water.boot;
//
//import com.github.water.boot.rest.v1.HellowResource;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.SpringApplicationConfiguration;
//import org.springframework.http.MediaType;
//import org.springframework.mock.web.MockServletContext;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.web.WebAppConfiguration;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//
//import static org.hamcrest.Matchers.equalTo;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
///**
// * @author water
// * 
// *         随着RESTful Web Service的流行，测试对外的Service是否满足期望也变的必要的。从Spring
// *         3.2开始Spring了Spring Web测试框架，
// *         如果版本低于3.2，请使用spring-test-mvc项目（合并到spring3.2中了）。 Spring
// *         MVC测试框架提供了对服务器端和客户端（基于RestTemplate的客户端）提供了支持。
// * 
// *         对于服务器端：在Spring 3.2之前，我们测试时一般都是直接new控制器，注入依赖，然后判断返回值。 但是我们无法连同Spring
// *         MVC的基础设施（如DispatcherServlet调度、类型转换、数据绑定、拦截器等）一起测试，
// *         另外也没有现成的方法测试如最终渲染的视图（@ResponseBody生成的JSON/XML、JSP、Velocity等）内容是否正确。
// *         从Spring 3.2开始这些事情都可以完成了。而且可以测试完整的Spring
// *         MVC流程，即从URL请求到控制器处理，再到视图渲染都可以测试。
// * 
// *         对于客户端：不需要启动服务器即可测试我们的RESTful 服务。
// *
// */
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(classes = MockServletContext.class)
//@WebAppConfiguration
//public class ApplicationMainTests {
//
//	private MockMvc mvc;
//
//	@Before
//	public void setUp() throws Exception {
//		mvc = MockMvcBuilders.standaloneSetup(new HellowResource()).build();
//	}
//
//	@Test
//	public void getHello() throws Exception {
//		mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
//				.andExpect(content().string(equalTo("Hello World")));
//	}
//
//}