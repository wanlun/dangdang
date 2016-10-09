package com.wang.serivces.impl;

import com.wang.entity.Order;
import com.wang.entity.Ordermain;
import com.wang.mapper.OrderMapper;
import com.wang.mapper.OrdermainMapper;
import com.wang.serivces.OrderServices1;

import com.wang.vo.BookVo;
import com.wang.vo.OrderVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

import java.util.UUID;

/**
 * Created by Administrator on 2016/10/8.
 */
@Service
public class OrderServicesImpl1 implements OrderServices1 {
    @Autowired
     private OrdermainMapper ordermainMapper;
    @Autowired
     private OrderMapper orderMapper;

    @Override
    @Transactional
    public boolean insert(OrderVo orderVo) {
         String orderId= UUID.randomUUID().toString();
          Order order=new Order();
        order.setOrderId(orderId);
        order.setCreatTime(new Date());
        order.setOrderStatu(1);
        order.setUserId(orderVo.getUserId());
        List<BookVo> list=orderVo.getBookVoList();
        int sum=0;
        for(BookVo h:list){
            sum+=h.getBookCount()*h.getBookPrice();
        }
         order.setOrderprice(String.valueOf(sum));
        //增加订单信息
          orderMapper.insertOrder( order);

        //在增加详情表的数据，循环增加多行数据
        for(BookVo h:list){
            Ordermain ordermain=new Ordermain();
            ordermain.setOrderId(orderId);
            ordermain.setBookId(h.getBookId());
            ordermain.setNumber(h.getBookCount());
            ordermain.setPrice(h.getBookPrice());
            ordermainMapper.insertOrdermain(ordermain);
        }
        return true ;
    }
}
