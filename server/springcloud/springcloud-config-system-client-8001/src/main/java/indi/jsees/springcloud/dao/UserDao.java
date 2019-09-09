package indi.jsees.springcloud.dao;

import indi.jsees.springcloud.entities.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {

    public User getUserById(Long userId);
    public boolean addUser(User user);
    public List<User> list();

}
