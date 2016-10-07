package com.wang.vo;

/**
 * 
 * @author wangguangjun
 */
public class BookVo {

	/**
	 *
	 *
	 * 图书的数量
	 */
	private  int count;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

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
	 *
	 * 购买数量
	 *
	 */
	private  Integer bookCount;
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
     * @return Integer
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
     * @return String
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
     * @return Double
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
     * @return Integer
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
     * @return String
     */	
    public String getBookPic(){
    	return bookPic;
    }

	public Integer getBookCount() {
		return bookCount;
	}

	public void setBookCount(Integer bookCount) {
		this.bookCount = bookCount;
	}
}