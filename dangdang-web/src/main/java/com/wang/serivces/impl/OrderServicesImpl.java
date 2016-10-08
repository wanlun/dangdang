package com.wang.serivces.impl;

import com.wang.entity.Order;
import com.wang.entity.Ordermain;
import com.wang.mapper.OrderMapper;
import com.wang.mapper.OrdermainMapper;
import com.wang.serivces.orderServices;
import com.wang.vo.BookVo;
import com.wang.vo.OrderVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by Administrator on 2016/10/8.
 */
@Service
public class OrderServicesImpl implements orderServices {
    @Autowired
   private OrderMapper orderMapper;
    @Autowired
    private OrdermainMapper ordermainMapper;
     @Override
    public boolean addorder(OrderVo orderVo) {
           //生成一个唯一编号
         String orderID= UUID.randomUUID().toString();
         //先增加订单表的数据
          Order o=new Order();
          o.setOrderId(orderID);
          o.setCreatTime(new Date());
          o.setOrderStatu(1);
          o.setUserId(orderVo.getUserId());
          int sum=0;//要用来计算订单的总价
         List<BookVo>   ordermianlist=orderVo.getBookVoList();
         for(BookVo b: ordermianlist){
              sum+=b.getBookCount()*b.getBookPrice();
         }
          o.setOrderprice(String.valueOf(sum));
           orderMapper.insertOrder(o);
         //再增加详情表的数据，循环增加多行数据
         for(BookVo b:ordermianlist){
             sum+=b.getBookCount()*b.getBookPrice();
             Ordermain  om=new Ordermain();
        /* *//*    String  ordermian=UUID.randomUUID().toString();*//*
             om.setOrdermainId(ordermian);*/
             om.setOrderId(orderID);
             om.setBookId(b.getBookId());
             om.setPrice(b.getBookPrice());
             om.setNumber(b.getBookCount());
             ordermainMapper.insertOrdermain(om);
         }
        return true;
    }

    @Override
    public List<Order> findOrderByOrder(Order order) {
        if(order != null) {
            Map<String,String> map = new HashMap<String,String>();
            if(order.getUserId()!=null) {
                map.put("userId",order.getUserId()+"");
            }
            return orderMapper.searchOrderByParams(map);
        }
        return null;
    }
}
