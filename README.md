# Spring-Boot-Lab

## 项目官网：<http://waterwang.github.io/spring-boot-lab/>
## 项目wiki：<https://github.com/waterWang/spring-boot-lab/wiki>  

## 项目简介
欢迎访问spring-boot-lab，旨在学习spring boot常用的场景分析及技术解决方案，如有问题欢迎大家随时提交issue。

 （1）集中式配置+注解，大大简化了开发流程；   
 （2）内嵌的Tomcat和Jetty容器，无需繁琐的Web配置；  
 （3）提供了Spring各个插件的基于Maven的pom模板配置，开箱即用；   
 （4）实现自动化配置；  
 （5）提供更多的企业级开发特性，如何系统监控，健康诊断，权限控制；   
 （6）无冗余代码生成和XML强制配置；  
 （7）提供支持强大的Restfult风格编码；
 
 
## 运行

mvn方式： mvn spring-boot:run
application方式：  运行main

## 包说明

root package结构：com.example.myproject
应用主类Application.java置于root package下，通常我们会在应用主类中做一些框架配置扫描等配置，我们放在root package下可以帮助程序减少手工配置来加载到我们希望被Spring加载的内容
实体（Entity）与数据访问层（Repository）置于com.example.myproject.domain包下
逻辑层（Service）置于com.example.myproject.service包下
Web层（web）置于com.example.myproject.controller包下

## 环境
	 jdk 8
	base on Spring-Boot 1.2.6

### 当前版本 v0.0.0.1

- [x] [初始化](d)   


## 意见反馈
欢迎大家随时提交反馈意见及功能需求，或fork之后new pull request，本人会及时对问题进行回复，[请戳我提交issue。](https://github.com/waterWang/spring-boot-lab/issues/new)

## 异常情况测试汇总  


## 参考文献
1.  spring boot 官网：<http://projects.spring.io/spring-boot/>
2.  spring boot 源码：<https://github.com/spring-projects/spring-boot>