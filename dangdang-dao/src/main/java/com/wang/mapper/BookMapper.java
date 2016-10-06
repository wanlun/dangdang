package com.wang.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import com.wang.entity.Book;
import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;

public interface BookMapper {

	void insertBook(Book book);

	void deleteBookByBookId(Integer bookId);

	void updateBook(Book book);

	Page<Book> searchBookByParams(@Param("map") Map<String, String> map, Pageable pageable);

	List<Book> searchBookByParams(@Param("map") Map<String, String> map);

} 
