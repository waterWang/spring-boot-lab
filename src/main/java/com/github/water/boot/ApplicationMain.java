package com.github.water.boot;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

/**
 * water
 * 
 * Spring中的配置类需要以@Configuration注解修饰，
 * 这里的@SpringBootApplication能被正常加载，
 * 是由于其整合了@Configuration、@EnableAutoConfiguration、@ComponentScan三个注解。
 */
@SpringBootApplication
public class ApplicationMain {

	private static final Logger log = LoggerFactory.getLogger(ApplicationMain.class);

	public static void main(String[] args) throws UnknownHostException {
		SpringApplication app = new SpringApplication(ApplicationMain.class);

		// SimpleCommandLinePropertySource source = new
		// SimpleCommandLinePropertySource(args);

		// Check if the selected profile has been set as argument.
		// if not the development profile will be added
		// addDefaultProfile(app, source);
		// addLiquibaseScanPackages();
		Environment env = app.run(args).getEnvironment();
		log.info(
				"Access URLs:\n----------------------------------------------------------\n\t"
						+ "Local: \t\thttp://127.0.0.1:{}\n\t"
						+ "External: \thttp://{}:{}\n----------------------------------------------------------",
				env.getProperty("server.port"), InetAddress.getLocalHost().getHostAddress(),
				env.getProperty("server.port"));

	}

}