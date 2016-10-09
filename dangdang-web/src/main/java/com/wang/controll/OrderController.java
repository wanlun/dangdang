package com.wang.controll;

import com.wang.entity.Order;
import com.wang.entity.Ordermain;
import com.wang.entity.User;
import com.wang.serivces.impl.OrderServicesImpl;
import com.wang.vo.BookVo;
import com.wang.vo.OrderVo;
import com.wang.vo.OrdermainVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/8.
 */
@Controller
public class OrderController {
    @Autowired
    private OrderServicesImpl orderServices;
    @RequestMapping("/addorder")
    @ResponseBody
    public String addOrder(HttpSession session, Ordermain ordermain) {
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
            if (boo = true) {
                return "orderlist";
            }
        } catch (Exception ex) {
            return "index";
        }
        return "orderlist";



}}

