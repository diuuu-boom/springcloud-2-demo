package indi.jsees.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import com.netflix.loadbalancer.RoundRobinRule;

@Configuration
public class ConfigBean { // boot --->spring  applicationContext.xml ---@Configuration配置 ConfigBean = applicationContext.xml

	@Bean
	//@LoadBalanced        //springCloud Ribbon 是基于 Netflix Ribbon实现的一套客户端   负载均衡的工具。
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
//	@Bean
//	public IRule myRule() {
////		return new RoundRobinRule(); 
////		return new RandomRule();  // 达到目的,用我们重新选择的随机算法替代默认的轮询.
//		return new RetryRule();
//	}
	
}

// @Bean
// public UserService getUserService(){
//
//  return new UserServiceImpl();
//
//}
// applicationContext.xml == ConfigBean(@Configuration);
// <bean id="userService" class="indi.jsees.springcloud.UserServiceImpl"></bean>
