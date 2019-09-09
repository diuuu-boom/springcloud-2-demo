package indi.jsees.springcloud.service;

import indi.jsees.springcloud.entities.User;

import java.util.List;

public interface UserService {


    public boolean add(User user);
    public User get(Long userId);
    public List<User> list();

}
