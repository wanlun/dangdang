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
        Map car=(Map) session.getAttribute("car");
        if(car==null){
            car=new HashMap();
        }
        for(int i=0;bookId!=null&&i<bookId.length;i++){
            String bookId1=bookId[i];
             Book book= booksServices.findbyId(bookId1);
            BookVo bookVo=new BookVo();

            bookVo.setBookId(book.getBookId());
            bookVo.setBookName(book.getBookName());
            bookVo.setBookPic(book.getBookPic());
            book.setBookStor(book.getBookStor());
            book.setBookPrice(book.getBookPrice());

            BookVo s=(BookVo)car.get(book.getBookId());
            if(s!=null){
                bookVo.setBookCount(s.getBookCount()+1);
            }
            else
                bookVo.setBookCount(1);

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
