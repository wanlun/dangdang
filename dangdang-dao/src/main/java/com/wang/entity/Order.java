package com.wang.entity;

/**
 * 
 * @author wangguangjun
 */
public class Order {
	/**
	 *  订单id
	 */
	private String orderId;
	/**
	 *  用户id
	 */
	private Integer userId;
	/**
	 *  订单创建时间
	 */
	private java.util.Date creatTime;
	/**
	 *  订单总价
	 */
	private String orderprice;
	/**
	 *  订单状态，1代表已付款，0未付款
	 */
	private Integer orderStatu;
	/**
	 * 订单id
	 * @param orderId
	 */
	public void setOrderId(String orderId){
		this.orderId = orderId;
	}
	
    /**
     * 订单id
     * @return
     */	
    public String getOrderId(){
    	return orderId;
    }
	/**
	 * 用户id
	 * @param userId
	 */
	public void setUserId(Integer userId){
		this.userId = userId;
	}
	
    /**
     * 用户id
     * @return
     */	
    public Integer getUserId(){
    	return userId;
    }
	/**
	 * 订单创建时间
	 * @param creatTime
	 */
	public void setCreatTime(java.util.Date creatTime){
		this.creatTime = creatTime;
	}
	
    /**
     * 订单创建时间
     * @return
     */	
    public java.util.Date getCreatTime(){
    	return creatTime;
    }
	/**
	 * 订单总价
	 * @param orderprice
	 */
	public void setOrderprice(String orderprice){
		this.orderprice = orderprice;
	}
	
    /**
     * 订单总价
     * @return
     */	
    public String getOrderprice(){
    	return orderprice;
    }
	/**
	 * 订单状态，1代表已付款，0未付款
	 * @param orderStatu
	 */
	public void setOrderStatu(Integer orderStatu){
		this.orderStatu = orderStatu;
	}
	
    /**
     * 订单状态，1代表已付款，0未付款
     * @return
     */	
    public Integer getOrderStatu(){
    	return orderStatu;
    }
}