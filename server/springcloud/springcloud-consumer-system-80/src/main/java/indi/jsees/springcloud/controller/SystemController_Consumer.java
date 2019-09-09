package indi.jsees.springcloud.controller;

import indi.jsees.springcloud.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class SystemController_Consumer {

    private static final String REST_URL_PREFIX = "http://localhost:8001";

    /**
     * 使用restTemplate 访问 restful 接口:
     * (url,RequestMap,ResponBean.class) 这三个参数分别代表:
     * REST 请求地址、请求参数、HTTP响应转换被转换成的对象类型
     */

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value="/consumer/system/user/add")
    public boolean add( User user){
        System.out.println("consumer: " + user);
        return restTemplate.postForObject(REST_URL_PREFIX + "/system/add",user,Boolean.class);
    }

    @RequestMapping(value = "/consumer/system/user/get/{userId}")
    public User get(@PathVariable("userId")Long userId){
        return restTemplate.getForObject(REST_URL_PREFIX + "/system/get/"+userId,User.class);
    }

    @RequestMapping(value="/consumer/system/user/list")
    public List<User> list(){
        return restTemplate.getForObject(REST_URL_PREFIX + "/system/list",List.class);
    }
}
