package com.wang.controll;

import com.wang.entity.Book;
import com.wang.serivces.BooksServices;
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
public class ShopController {

    @Autowired
    private BooksServices booksServices;

    @RequestMapping("/putcar")
    public String putcar(@RequestParam("bookId") String[]bookId,HttpSession session ){
        //创建了一个购物车对象,先假设session中有购物车，如果没有才创建购物车
        Map car=(Map) session.getAttribute("car");//假设session中有购物车
        if(car==null){    //假设session中有购物车
            if(car==null)
                car=new HashMap();
        }
        for(int i=0;bookId!=null&&i<bookId.length;i++){
            String bookId1=bookId[i];
            //通过BookID获取Book对象
             Book book= booksServices.findbyId(bookId1);
            BookVo bookVo=new BookVo();

            bookVo.setBookId(book.getBookId());
            bookVo.setBookName(book.getBookName());
            bookVo.setBookPic(book.getBookPic());
            book.setBookStor(book.getBookStor());
            book.setBookPrice(book.getBookPrice());

            BookVo s=(BookVo)car.get(book.getBookId());
            //如果购物中存在相同的图书。则购买数量为当前购物车中的图书数量加一。否则购买数量为1
            if(s!=null){
                bookVo.setBookCount(s.getBookCount()+1);
            }
            else
                bookVo.setBookCount(1);
            //预备把vo对象放入到购物车中
            car.put(bookVo.getBookId(),bookVo);
        }
        session.setAttribute("car", car);
        return "redirect:/toshoping";

    }

    @RequestMapping("/toshoping")
    public String shop(){
        return "shop";
    }




}
