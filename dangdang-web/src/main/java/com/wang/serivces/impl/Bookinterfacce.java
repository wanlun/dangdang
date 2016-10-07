package com.wang.serivces.impl;

import com.fc.platform.commons.page.Page;
import com.wang.entity.Book;

import java.util.List;

/**
 * Created by Administrator on 2016/10/7.
 */
public interface Bookinterfacce {

        /*查询全部没有分页*/
       List<Book> findall();
       /*查询全部，有分页*/
       Page<Book> findpageall(int page,int count);

        Book findbyId(String bookId);

       int deleteByBookId(Integer bookId);




}
