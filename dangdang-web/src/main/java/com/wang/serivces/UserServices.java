package com.wang.serivces;

import com.wang.entity.User;

/**
 * Created by Administrator on 2016/10/6.
 */
public interface UserServices {
    public User find(String name,String pwd);
    public int insert(User user);

}
