package com.wang.controll;

import com.wang.entity.Order;
import com.wang.entity.Ordermain;
import com.wang.entity.User;
import com.wang.mapper.OrdermainMapper;
import com.wang.serivces.Bookinterfacce;

import com.wang.serivces.impl.OrderServicesImpl;
import com.wang.vo.BookVo;
import com.wang.vo.OrderVo;
import com.wang.vo.OrdermainVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.*;

/**
 * Created by Administrator on 2016/10/8.
 */
@Controller
public class OrderController {
    @Autowired
    private OrderServicesImpl orderServices;

    @Autowired
    private OrdermainMapper ordermainMapper;

    @Autowired
    private Bookinterfacce booksServices;

    @RequestMapping("/addorder")
    public String addOrder(HttpSession session, OrdermainVo ordermainVo) {
        try {
        /*从Session对象中获取用户对象*/
            User user = (User) session.getAttribute("user");
            /*从session对象中获取购物车对象*/
            Map<Integer, BookVo> car = (Map) session.getAttribute("car");
            //获取购物车中的所有的值
            Collection<BookVo> values = car.values();
            List<BookVo> bookVoList = new ArrayList<BookVo>();
            for (BookVo b : values) {
                bookVoList.add(b);
            }
            OrderVo om = new OrderVo();
            om.setUserId(user.getUserId());
            om.setBookVoList(bookVoList);
            boolean boo = orderServices.addorder(om);
              if(boo=true){
                  return "redirect:/findorder";
              }
        } catch (Exception ex) {
            ex.printStackTrace();
            return "redirect:/findallBooks1";
        }
        return "redirect:/findorder";
}
         @RequestMapping("findorder")
     public String orderList(HttpSession session,ModelMap modelMap) {
        User str= (User)session.getAttribute("user");

         Order o=new Order();
         o.setUserId(str.getUserId());
         List<Order> list = orderServices.findOrderByOrder(o);
             System.out.println(list);
             List<String> bookPictureList = new ArrayList<String>();
             List<OrderVo> orderVoList = new ArrayList<OrderVo>();
             for(Order order:list) {
                 Map<String,String> orderMainMap = new HashMap<String, String>();
                 orderMainMap.put("orderId",order.getOrderId());
                 List<Ordermain> orderMainlist = ordermainMapper.searchOrdermainByParams(orderMainMap);
                 for(Ordermain ordermain:orderMainlist) {
                     String bookPicture = booksServices.findbyId(ordermain.getBookId()+"").getBookPic();
                     bookPictureList.add(bookPicture);
                 }
                 OrderVo orderVo = new OrderVo();
                 orderVo.setBookPicture(bookPictureList);
                 orderVo.setUserId(order.getUserId());
                 orderVo.setOrderId(order.getOrderId());
                 orderVo.setCreatTime(order.getCreatTime());
                 orderVo.setOrderprice(Double.parseDouble(order.getOrderprice()));
                 orderVo.setOrderStatu(order.getOrderStatu());
                 orderVoList.add(orderVo);
             }
         modelMap.put("orderVoList",orderVoList);
         return "orderlist";


     }
}

