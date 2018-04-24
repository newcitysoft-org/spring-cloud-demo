package com.newcitysoft.research;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lixin.tian@renren-inc.com
 * @date 2018/4/23 16:52
 */
@RestController
public class DcController {

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/dc")
    public String dc() throws InterruptedException {
        Thread.sleep(5000L);
        String services = "Services: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }
}
