package com.wang.serivces;

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
    @Override
    public List<Book> findall() {
          List<Book> books=bookMapper.searchBookByParams(null);
        return books;
    }



}
