package com.wang.vo;

/**
 * 
 * @author wangguangjun
 */
public class UserVo {
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
     * @return Integer
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
     * @return String
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
     * @return String
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
     * @return String
     */	
    public String getEmail(){
    	return email;
    }
}