package com.wang.serivces.impl;

import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.PageRequest;
import com.wang.entity.Book;
import com.wang.mapper.BookMapper;
import com.wang.serivces.Bookinterfacce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/6.
 */
@Service
public class BooksServicesImpl implements Bookinterfacce {

    @Autowired
    private BookMapper bookMapper;


    /*   这个是查询全部的方法，这个是没有进行分页的*/
    @Override
    public List<Book> findall() {
        List<Book> books=bookMapper.searchBookByParams(null);
        return books;
    }

    @Override
    public Page<Book> findpageall(int page,int count) {
        /*第一个参数是第几页，第二个参数是每页显示几个*/
        PageRequest pa=new PageRequest(page,count);
        Page<Book> pages=bookMapper.searchBookByParams(null,pa);
        return pages;
    }

    public Book findbyId(String bookId) {
        Map s=new HashMap();
        s.put("bookId",bookId);
        List<Book> list=bookMapper.searchBookByParams(s);
        if(list.size()==1){
            return list.get(0);
        }
        else
            return null;
    }

    @Override
    public int deleteByBookId(Integer bookId) {
        int m= bookMapper.deleteBookByBookId(bookId);
        if(m!=0){
            return m;
        }
        else
            return -1;
    }

}
