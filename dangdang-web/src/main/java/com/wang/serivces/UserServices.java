package com.wang.serivces;

import com.wang.entity.User;

/**
 * Created by Administrator on 2016/10/6.
 */
public interface UserServices {
    public int check(String name,String pwd);
    public int insert(User user);

}
