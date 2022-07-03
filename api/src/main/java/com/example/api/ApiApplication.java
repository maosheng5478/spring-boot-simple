package com.example.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

/**
 * @author maoshen5478
 */
@ComponentScan(basePackages = {"com.example.api","com.example.core"})
@SpringBootApplication
public class ApiApplication {

    private static final Logger log = LoggerFactory.getLogger(ApiApplication.class) ;

    public static void main(String[] args) {
        try {
            SpringApplication application = new SpringApplication(ApiApplication.class);
            Environment environment = application.run(args).getEnvironment();
            log.info("Knife4j文档地址：http://localhost:{}/doc.html", environment.getProperty("server.port"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
