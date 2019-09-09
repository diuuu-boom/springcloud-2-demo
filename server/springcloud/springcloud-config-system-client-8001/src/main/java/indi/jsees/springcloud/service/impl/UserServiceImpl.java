package indi.jsees.springcloud.service.impl;

import indi.jsees.springcloud.dao.UserDao;
import indi.jsees.springcloud.entities.User;
import indi.jsees.springcloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public boolean add(User user) {
        return userDao.addUser(user);
    }

    @Override
    public User get(Long userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public List<User> list() {
        return userDao.list();
    }
}
