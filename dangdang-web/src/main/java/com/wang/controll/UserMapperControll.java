package com.wang.controll;

import com.wang.entity.User;
import com.wang.serivces.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2016/10/6.
 */
@Controller
public class UserMapperControll {
   @Autowired
   private UserServices userServices;


    @RequestMapping("/check")
    @ResponseBody
    public int check(@RequestParam("userName") String userName, @RequestParam("passWord") String passWord){
        int s= userServices.check(userName,passWord);
        return s;
    }


        @RequestMapping("/add")
        @ResponseBody
        public int zengjia (User user,ModelMap modelMap) {
            int bo = userServices.insert(user);
              return bo;
        }

    @RequestMapping("/addok")
      public String chenggong () {
        return "zhuceok";

    }

    @RequestMapping("/zc")
    public String tozhuce (){

        return "zhuce";
    }

}
