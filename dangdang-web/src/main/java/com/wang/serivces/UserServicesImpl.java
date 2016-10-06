package com.wang.serivces;

import com.wang.entity.User;
import com.wang.mapper.UserMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/6.
 */
@Service
public class UserServicesImpl implements UserServices {
    @Autowired
    private UserMapper userMapper;
    //查询单个
    public int check(String userName, String passWord) {
        Map<String,String> map=new HashMap<String,String>();
        map.put("userName",userName);
        map.put("passWord",passWord);
     List<User> list= userMapper.searchUserByParams(map);
        if(list.size()!=0){
          return list.size();
        }
        else
            return -1;
    }
}
