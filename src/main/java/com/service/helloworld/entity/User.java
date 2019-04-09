package com.service.helloworld.entity;

/**
 * @author ljs
 * @version V1.0
 * @Title: ${file_name}
 * @Package com.lynn.demo.entity
 * @Description: TODO
 * @date 2019/3/15 13:50
 */
public class User {
    private int id ;
    private String name= null;
    private String password = null;
    private  String phone = null;
    private String city = null;
    private String ip = null;
    private String img = null;
    private String wechat = null;
    private String sina = null;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public String getSina() {
        return sina;
    }

    public void setSina(String sina) {
        this.sina = sina;
    }
}
