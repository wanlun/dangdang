package com.wang.serivces;

import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.PageRequest;
import com.wang.entity.Book;
import com.wang.mapper.BookMapper;
import com.wang.serivces.impl.Bookinterfacce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2016/10/6.
 */
@Service
public class BooksServices implements Bookinterfacce {
    @Resource
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
}
