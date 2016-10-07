package com.wang.controll;

import com.wang.entity.Book;
import com.wang.serivces.impl.Bookinterfacce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.PrivateKey;
import java.util.List;

/**
 * Created by Administrator on 2016/10/7.
 */
@Controller
public class BookController {
      @Autowired
     private Bookinterfacce bookinterfacce;

      @RequestMapping("findallBooks")
      public  String findallbooks(ModelMap modelMap){
          List<Book> books=bookinterfacce.findall();
              modelMap.put("books",books);
           return "index" ;
      }
}
