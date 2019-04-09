package com.service.helloworld.controller;


import javax.ws.rs.core.MediaType;

import com.service.helloworld.entity.User;
import com.service.helloworld.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2019-04-03T03:34:04.490Z")

@RestSchema(schemaId = "helloworld")
@RequestMapping(path = "/helloworldprovider", produces = MediaType.APPLICATION_JSON)
public class HelloworldproviderImpl {

    @Autowired
    private HelloworldproviderDelegate userHelloworldproviderDelegate;
    @Autowired
    private UserService userService;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userHelloworldproviderDelegate.helloworld(name);
    }

    @RequestMapping(value="/getAllUsers", produces = { "application/json" }, method=RequestMethod.GET)
    public List<User> getAllUsers(){
        List<User> listUser = userService.getAllUsers();
        //获取服务信息
       // ServiceInstance instance = client.getLocalServiceInstance();
        //输出服务信息
        System.out.println("result={}"+listUser);
        return listUser;
    }

    @RequestMapping(value="/getUser", produces = { "application/json" }, method=RequestMethod.GET)
    public User getUser(){
        User user = userService.getUserById(1);
        //获取服务信息
        // ServiceInstance instance = client.getLocalServiceInstance();
        //输出服务信息
        System.out.println("result={}"+user);
        return user;
    }

}
