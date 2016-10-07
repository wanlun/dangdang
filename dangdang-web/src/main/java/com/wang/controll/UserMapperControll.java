package com.wang.controll;

import com.wang.entity.User;
import com.wang.serivces.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2016/10/6.
 */
@Controller
public class UserMapperControll {
    @Autowired
    private UserServices userServices;

   //判断是否有该用户
    @RequestMapping("/check")
    @ResponseBody
    public User check(@RequestParam("userName") String userName, @RequestParam("passWord") String passWord,HttpSession session) {
       User user = userServices.find(userName, passWord);
        session.setAttribute("User",user);
        return user;
    }

    @RequestMapping("/denglu")
    public String denglu() {
        return "orderlist";

    }
    //跳到注册页面
    @RequestMapping("/zc")
    public String zc() {
        return "zhuce";

    }
    //注册
    @RequestMapping("/add")
    public String dengluOK(User user) {
        int m=userServices.insert(user);
        if(m==1)
           return "zhuceok";
       else
            return "zhuce";
    }
    //跳到主页

    @RequestMapping("/foto")
    public String foto() {
        return "index";

    }
  //session注销
    @RequestMapping("/des")
    public String des(HttpSession session) {
        session.invalidate();
        return "login.html";


    }
}



