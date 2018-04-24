package com.newcitysoft.research;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author lixin.tian@renren-inc.com
 * @date 2018/4/23 16:52
 */
@EnableDiscoveryClient
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        new SpringApplicationBuilder(
                Application.class)
                .web(true).run(args);
    }
}
