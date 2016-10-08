package com.wang.controll;

import com.wang.entity.User;
import com.wang.serivces.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2016/10/6.
 */
@Controller
public class UserMapperControll extends  BaseController {
    @Autowired
    private UserService userService;

   //判断是否有该用户
    @RequestMapping("/check")

    public String check(@RequestParam("userName") String userName, @RequestParam("passWord") String passWord,HttpSession session) {
       User user = userService.find(userName, passWord);
        if (user==null){
            return "redirect:/login.html";
        }else{
            session.setAttribute("user",user);
            return "redirect:/findallBooks1";
        }

    }


    //跳到注册页面
    @RequestMapping("/zc")
    public String zc() {
        return "zhuce";

    }
    //注册
    @RequestMapping("/add")
    public String dengluOK(User user) {
        int m=userService.insert(user);
        if(m==1)
           return "zhuceok";
       else
            return "zhuce";
    }

  //session注销
    @RequestMapping("/des")
    public String des(HttpSession session) {
        session.invalidate();
        return "redirect:/login.html";


    }
}



