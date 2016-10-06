package com.wang.entity;

/**
 * 
 * @author wangguangjun
 */
public class User {
	/**
	 *  用户id
	 */
	private Integer userId;
	/**
	 *  
	 */
	private String userName;
	/**
	 *  
	 */
	private String passWord;
	/**
	 *  
	 */
	private String email;
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
	 * 
	 * @param userName
	 */
	public void setUserName(String userName){
		this.userName = userName;
	}
	
    /**
     * 
     * @return
     */	
    public String getUserName(){
    	return userName;
    }
	/**
	 * 
	 * @param passWord
	 */
	public void setPassWord(String passWord){
		this.passWord = passWord;
	}
	
    /**
     * 
     * @return
     */	
    public String getPassWord(){
    	return passWord;
    }
	/**
	 * 
	 * @param email
	 */
	public void setEmail(String email){
		this.email = email;
	}
	
    /**
     * 
     * @return
     */	
    public String getEmail(){
    	return email;
    }
}