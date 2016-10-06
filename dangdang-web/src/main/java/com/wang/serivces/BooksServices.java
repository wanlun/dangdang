package com.wang.serivces;

import com.wang.entity.Book;
import com.wang.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Administrator on 2016/10/6.
 */
@Service
public class BooksServices {
     @Autowired
      private BookMapper bookMapper;

    /*调用查询全部的方法，传一个Null进去，就是查询全部*/
    @RequestMapping("/wanlun")
    public  String findall(ModelMap modelMap){
         List<Book>  data=bookMapper.searchBookByParams(null);
          modelMap.put("data",data);
        return  "findallbooks";
    }
}
