package indi.jsees.springcloud.controller;

import indi.jsees.springcloud.entities.User;
import indi.jsees.springcloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value="/system/add",method = RequestMethod.POST)
    public Boolean add(@RequestBody User user){
        System.out.println("provider: " + user);
        return userService.add(user);
    }

    @RequestMapping(value = "/system/list",method = RequestMethod.GET)
    public List<User> list(){
        return userService.list();
    }

    @RequestMapping(value="/system/get/{userId}",method = RequestMethod.GET)
    public User get(@PathVariable("userId") Long userId){
        return userService.get(userId);
    }

    @RequestMapping(value="/dept/discovery",method = RequestMethod.GET)
    public Object discovery() {
        List<String> list = client.getServices();
        System.out.println("*************" + list);
        List<ServiceInstance> servList = client.getInstances("MICROSERVICECLOUD-DEPT");
        for(ServiceInstance element : servList) {
            System.out.println(element.getServiceId()+"\t"+element.getHost()+"\t"+element.getPort()+"\t"+element.getUri());
        }
        return this.client;
    }

}
