package indi.jsees.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 *	 消费者项目启动
 * @author winer
 *
 */

@SpringBootApplication
//@EnableEurekaClient
//在启动该微服务时候就能去加载我们自定义Ribbon配置类,从而使配置生效 
//@RibbonClient(name="MICROSERVICECLOUD-DEPT",configuration=MySelfRule.class)
//@RibbonClient(name="MICROSERVICECLOUD-DEPT",configuration=MySelfRule.class)
public class SystemConsumer80_App {
	
	public static void main(String[] args) {
		SpringApplication.run(SystemConsumer80_App.class, args);
		System.out.println("消费者80端口已启动...");
	}

}
