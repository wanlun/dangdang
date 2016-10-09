package com.wang.controll;

import com.wang.entity.Book;
import com.wang.serivces.impl.BooksServicesImpl;
import com.wang.vo.BookVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/7.
 */

@Controller
public class ShopController {

    @Autowired
    private BooksServicesImpl booksServicesImpl;

    @RequestMapping("/putcar")
    public String putcar(@RequestParam("bookId") String[]bookId,HttpSession session ){
        //创建了一个购物车对象,先假设session中有购物车，如果没有才创建购物车
        Map car=(Map) session.getAttribute("car");//假设session中有购物车
        if(car==null){
        //假设session中有购物车
            if(car==null)
                car=new HashMap();
        }

        for(int i=0;bookId!=null&&i<bookId.length;i++){
            String bookId1=bookId[i];
            //通过BookID获取Book对象
             Book book= booksServicesImpl.findbyId(bookId1);
            BookVo bookVo=new BookVo();

            bookVo.setBookId(book.getBookId());
            bookVo.setBookName(book.getBookName());
            bookVo.setBookPic(book.getBookPic());
            bookVo.setBookStor(book.getBookStor());
            bookVo.setBookPrice(book.getBookPrice());

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


    @RequestMapping("/removecar")
    public String removecar(@RequestParam("bookId") Integer bookId,HttpSession session){
       //获取map
        Map car=(Map)session.getAttribute("car");
        //通过id键，在map中删除值
        car.remove(bookId);
        //将删除过后的购物车放入session中
        session.setAttribute("car", car);
        return "redirect:/toshoping";
    }

    @RequestMapping("/xiugai")
    @ResponseBody
    public Object update(@RequestParam("bookId") Integer bookId,@RequestParam("bookCount") Integer bookCount ,HttpSession session){
        //获取这个map
        Map car=(Map)session.getAttribute("car");
        //通过id在map里找出对应的bookvo
         BookVo bookVo=(BookVo)car.get(bookId);
        //更改书的数量
         bookVo.setBookCount(bookCount);
        int sum=0;
        //获取购物车中的所有书
          Collection<BookVo> s=car.values();
          for(BookVo b:s){
              //循环计算总计
              sum+=b.getBookCount()*b.getBookPrice();
          }
        //将修改好的购物车放入session
          session.setAttribute("car", car);
              return  sum;
    }

   /* @RequestMapping("/deletebook")
    @ResponseBody
    public Object deleteBook(@RequestParam("bookId") Integer bookId,HttpSession session){

        Map cart=(Map)session.getAttribute("car");
        cart.remove(bid);
        session.setAttribute("car",car);
        int sum=0;
        Collection<BookVo> value= cart.values();
        for(BookVo vo : value){
            sum+=vo.getCount()*vo.getBookprice();
        }
        return sum;
    }*/


}