package com.wang.controll;

import com.wang.entity.Book;
import com.wang.serivces.impl.BooksServices;
import com.wang.vo.BookVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/7.
 */
@Controller
public class ShoppingCarController {
      @Autowired
     private BooksServices booksServices;

      /*@RequestMapping("/putshoppingcar")
      public  String putshoppingcar(@RequestParam("bookId")String[] bookId,HttpSession session){
       //创建一个购物成为对象，先假设有一个购物车对象，如果没有就创建一个购物车对象
         Map shoppingcar=(Map)session.getAttribute("shopingcar");
           if(shoppingcar==null){
                shoppingcar=new HashMap();
           }
           //通过bookid获得book对象
         for(int i=0;i<bookId.length;i++){
            String booksID=bookId[i] ;
             Book book=booksServices.findbyId(booksID);
             BookVo  bookVo=new BookVo();
             //赋值
             bookVo.setBookId(book.getBookId());
             bookVo.setBookName(book.getBookName());
             bookVo.setBookPic(book.getBookPic());
             bookVo.setBookPrice(book.getBookPrice());
             //如果购物车中存在相同的图书，则购买的数量在当前的购物车中的图书数量加一，否则数量为一
             BookVo catbookvo=(BookVo)shoppingcar.get(bookVo.getBookId());
             if(catbookvo==null){
                 bookVo.setBookCount(1);
             }else{
                 bookVo.setBookCount(catbookvo.getBookCount()+1);
             }
             shoppingcar.put(bookVo.getBookId(),bookVo);
         }
          session.setAttribute("shoppingcar",shoppingcar);
          return "redirect:/toshoping";
     }


       @RequestMapping("toshoping")
       public  String shopping(){
           return "shoppingcar";
       }*/
}

