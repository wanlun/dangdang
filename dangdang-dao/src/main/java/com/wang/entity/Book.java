package com.wang.entity;

/**
 * 
 * @author wangguangjun
 */
public class Book {
	/**
	 *  图书id
	 */
	private Integer bookId;
	/**
	 *  图书名字
	 */
	private String bookName;
	/**
	 *  图书价格
	 */
	private Double bookPrice;
	/**
	 *  图书库存
	 */
	private Integer bookStor;
	/**
	 *  图书图片
	 */
	private String bookPic;
	/**
	 * 图书id
	 * @param bookId
	 */
	public void setBookId(Integer bookId){
		this.bookId = bookId;
	}
	
    /**
     * 图书id
     * @return
     */	
    public Integer getBookId(){
    	return bookId;
    }
	/**
	 * 图书名字
	 * @param bookName
	 */
	public void setBookName(String bookName){
		this.bookName = bookName;
	}
	
    /**
     * 图书名字
     * @return
     */	
    public String getBookName(){
    	return bookName;
    }
	/**
	 * 图书价格
	 * @param bookPrice
	 */
	public void setBookPrice(Double bookPrice){
		this.bookPrice = bookPrice;
	}
	
    /**
     * 图书价格
     * @return
     */	
    public Double getBookPrice(){
    	return bookPrice;
    }
	/**
	 * 图书库存
	 * @param bookStor
	 */
	public void setBookStor(Integer bookStor){
		this.bookStor = bookStor;
	}
	
    /**
     * 图书库存
     * @return
     */	
    public Integer getBookStor(){
    	return bookStor;
    }
	/**
	 * 图书图片
	 * @param bookPic
	 */
	public void setBookPic(String bookPic){
		this.bookPic = bookPic;
	}
	
    /**
     * 图书图片
     * @return
     */	
    public String getBookPic(){
    	return bookPic;
    }
}