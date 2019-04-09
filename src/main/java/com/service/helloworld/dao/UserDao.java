package com.service.helloworld.dao;

import com.service.helloworld.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author ljs
 * @version V1.0
 * @Title: ${file_name}
 * @Package com.lynn.demo.dao
 * @Description: TODO
 * @date 2019/3/15 13:48
 */
@Mapper
public interface UserDao {

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> getAllUsers();
}
