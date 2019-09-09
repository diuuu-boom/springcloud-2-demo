package indi.jsees.springcloud.service;

import feign.hystrix.FallbackFactory;
import indi.jsees.springcloud.entities.User;

import java.util.List;

public class SystemClientServiceFallbackFactory implements FallbackFactory<SystemClientService> {
    @Override
    public SystemClientService create(Throwable cause) {

        // TODO Auto-generated method stub
        return new SystemClientService() {

            @Override
            public List<User> list() {
                // TODO Auto-generated method stub
                return null;
            }

            @Override
            public User get(long userId) {
                return new User().setUsername("该userId: "+userId+"没有对应的信息,Consumer客户端提供降级信息,此刻服务Provider已经关闭 --@@HystrixCommand")
                        .setAge(0).setHobby("未注册账号")
                        .setDb_source("no this database in MySQL");
            }

            @Override
            public boolean add(User user) {
                // TODO Auto-generated method stub
                return false;
            }
        };

    }
}
