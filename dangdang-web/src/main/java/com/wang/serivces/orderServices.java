package com.wang.serivces;

import com.wang.entity.Order;
import com.wang.vo.OrderVo;

import java.util.List;

/**
 * Created by Administrator on 2016/10/8.
 */
public interface orderServices {

      boolean addorder(OrderVo orderVo);

      List<Order> findOrderByOrder(Order order);
}
