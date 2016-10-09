package com.wang.controll;

import com.wang.entity.User;
import com.wang.serivces.OrderServices1;
import com.wang.vo.BookVo;
import com.wang.vo.OrderVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/8.
 */
@Controller
public class OrderController1 {

    @Autowired
    private OrderServices1 orderServices1;
    @RequestMapping("/addorder1")

    public String  addorder1(HttpSession session){
        try{
            User user=(User) session.getAttribute("user");
             Map car=(Map)  session.getAttribute("car");
               Collection<BookVo> collection= car.values();
               List<BookVo> list=new LinkedList<BookVo>();
                  for(BookVo g:collection){
                      list.add(g);
                  }
               OrderVo orderVo=new OrderVo();
            orderVo.setUserId(user.getUserId());
            orderVo.setBookVoList(list);
            orderServices1.insert(orderVo);
              return "orderlist";
        }
        catch (Exception d){
            d.printStackTrace();
           return "shop";


        }
    }
}
