package com.wang.vo;

import java.util.List;

/**
 * 
 * @author wangguangjun
 */
public class OrdermainVo {


	private  Integer userId;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 *  订单详情id
	 */
	private Integer ordermainId;
	/**
	 *  订单id
	 */
	private String orderId;
	/**
	 *  图书id
	 */
	private Integer bookId;
	/**
	 *  交易价格
	 */
	private String price;
	/**
	 *  每本书的购买数量
	 */
	private Integer number;
	/**
	 * 订单详情id
	 * @param ordermainId
	 */
	public void setOrdermainId(Integer ordermainId){
		this.ordermainId = ordermainId;
	}
	
    /**
     * 订单详情id
     * @return Integer
     */	
    public Integer getOrdermainId(){
    	return ordermainId;
    }
	/**
	 * 订单id
	 * @param orderId
	 */
	public void setOrderId(String orderId){
		this.orderId = orderId;
	}
	
    /**
     * 订单id
     * @return Integer
     */	
    public String getOrderId(){
    	return orderId;
    }
	/**
	 * 图书id
	 * @param bookId
	 */
	public void setBookId(Integer bookId){
		this.bookId = bookId;
	}
	
    /**
     * 图书id
     * @return Integer
     */	
    public Integer getBookId(){
    	return bookId;
    }
	/**
	 * 交易价格
	 * @param price
	 */
	public void setPrice(String price){
		this.price = price;
	}
	
    /**
     * 交易价格
     * @return Double
     */	
    public String getPrice(){
    	return price;
    }
	/**
	 * 每本书的购买数量
	 * @param number
	 */
	public void setNumber(Integer number){
		this.number = number;
	}
	
    /**
     * 每本书的购买数量
     * @return Integer
     */	
    public Integer getNumber(){
    	return number;
    }
}