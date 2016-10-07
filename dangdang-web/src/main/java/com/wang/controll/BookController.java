package com.wang.controll;

import com.fc.platform.commons.page.Page;
import com.wang.entity.Book;
import com.wang.serivces.impl.Bookinterfacce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.PrivateKey;
import java.util.List;

/**
 * Created by Administrator on 2016/10/7.
 */
@Controller
public class BookController {
      @Autowired
     private Bookinterfacce bookinterfacce;

      @RequestMapping("/findallBooks1")
      public  String findallbooks(ModelMap modelMap){
          List<Book> books=bookinterfacce.findall();
              modelMap.put("books",books);
           return "index1" ;
      }

    @RequestMapping("/findallBooks1")
    public  String findallbookspage(@RequestParam(name="page",defaultValue="0")Integer page,ModelMap modelMap){
        if(page<0){page=0;}
            Page<Book> pages=bookinterfacce.findpageall(page, 4);
             List<Book> boo=pages.getContent();
          //获得总的条数
              int  yeshu=pages.getTotalPages();
        if (page>pages.getTotalPages()-1){page=pages.getTotalPages();}
                  modelMap.put("page",page);
                  modelMap.put("boo",boo);
                  modelMap.put("yeshu",yeshu);

        return "index" ;




    }

}
