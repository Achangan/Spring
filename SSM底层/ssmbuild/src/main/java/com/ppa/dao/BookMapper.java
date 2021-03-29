package com.ppa.dao;

import com.ppa.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    //增加一本
    int addBook(Books books);
    //删除一本
    int deleteBook(@Param("bookId") int id);
    //更新一本
    int updateBook(Books books);
    //查询一本
    Books queryBookById(@Param("bookID") int id);
    //查询全部
    List<Books> queryAllBook();
}
