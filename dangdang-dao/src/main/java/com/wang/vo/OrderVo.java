package com.wang.vo;

/**
 * 
 * @author wangguangjun
 */
public class OrderVo {
	/**
	 *  订单id
	 */
	private Integer orderId;
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
	private Double orderprice;
	/**
	 *  订单状态，1代表已付款，0未付款
	 */
	private Integer orderStatu;
	/**
	 * 订单id
	 * @param orderId
	 */
	public void setOrderId(Integer orderId){
		this.orderId = orderId;
	}
	
    /**
     * 订单id
     * @return Integer
     */	
    public Integer getOrderId(){
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
     * @return Integer
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
     * @return java.util.Date
     */	
    public java.util.Date getCreatTime(){
    	return creatTime;
    }
	/**
	 * 订单总价
	 * @param orderprice
	 */
	public void setOrderprice(Double orderprice){
		this.orderprice = orderprice;
	}
	
    /**
     * 订单总价
     * @return Double
     */	
    public Double getOrderprice(){
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
     * @return Integer
     */	
    public Integer getOrderStatu(){
    	return orderStatu;
    }
}