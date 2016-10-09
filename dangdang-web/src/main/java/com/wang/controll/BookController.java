package com.wang.controll;

import com.fc.platform.commons.page.Page;
import com.wang.entity.Book;
import com.wang.serivces.Bookinterfacce;
import com.wang.serivces.impl.BooksServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2016/10/7.
 */
@Controller
public class BookController  extends BaseController{
      @Autowired
      private BooksServices booksServices;

      @RequestMapping("/findallBooks")
      public  String findallbooks(ModelMap modelMap){
          List<Book> books=booksServices.findall();
              modelMap.put("books",books);
           return "index" ;
      }

    @RequestMapping("/findallBooks1")
    public  String findallbookspage(@RequestParam(name="page",defaultValue="0")Integer page,ModelMap modelMap){
        if(page<0){
            page=0;
        }
            Page<Book> pages=booksServices.findpageall(page, 4);
             List<Book> boo=pages.getContent();
        System.out.println(boo);
          //获得总的条数
              int  yeshu=pages.getTotalPages()-1;
        if (page>yeshu){
            page=yeshu;
            pages=booksServices.findpageall(page, 4);
            boo=pages.getContent();
        }

                  modelMap.put("page",page);
                  modelMap.put("boo",boo);
                  modelMap.put("yeshu",yeshu);

        return "index" ;
    }

    @RequestMapping("/shanBooks")
    @ResponseBody
    public  int findallbooks(@RequestParam("bookId") int bookId ){
            int s= booksServices.deleteByBookId(bookId);
            return s;
    }

}
