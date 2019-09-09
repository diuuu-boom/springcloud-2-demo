package indi.jsees.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient   // 本服务启动后会自动注册进 eureka
@EnableDiscoveryClient  // 服务发现
public class SystemProvider8002_App {

    public static void main(String[] args) {
        SpringApplication.run(SystemProvider8002_App.class,args);
        System.out.println("已启动8002消费者...");
    }

}
