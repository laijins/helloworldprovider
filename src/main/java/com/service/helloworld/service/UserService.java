package com.service.helloworld.service;


import com.service.helloworld.dao.UserDao;
import com.service.helloworld.entity.User;
import org.apache.servicecomb.provider.pojo.RpcSchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

/**
 * @author ljs
 * @version V1.0
 * @Title: ${file_name}
 * @Package com.lynn.demo.demo
 * @Description: TODO
 * @date 2019/3/15 14:01
 */
@RpcSchema(schemaId = "userService")
public class UserService {
    @Inject
    private UserDao userDao;

    public int addUser(User user){
        return userDao.insert(user);
    }

    public User getUserById(int id){
        return userDao.selectByPrimaryKey(id);
    }

    public List<User> getAllUsers(){
        return userDao.getAllUsers();
    }
}
