package com.wang.serivces;

import com.wang.entity.User;

/**
 * Created by Administrator on 2016/10/6.
 */
public interface UserService {
    public User find(String userName,String passWord);
    public int insert(User user);

};