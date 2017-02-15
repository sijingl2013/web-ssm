package com.mybatis.service;

import com.mybatis.dao.BlogMapper;
import com.mybatis.model.Blog;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.BasicConfigurator;
import org.junit.Test;

import java.util.HashMap;

/**
 * Created by sijingl on 2017-01-13.
 */
public class BlogMapperTest {
    @Test
    public void test() {
        BasicConfigurator.configure();
        SqlSession session = null;
        Blog blog = null;
        try {
            SqlSessionFactory factory = SqlMapperManager.getFactory();
            if (factory == null) {
                System.out.println("get SqlSessionFactory failed");
                return;
            }
            session = factory.openSession();
            HashMap<String, Integer> paramMap = new HashMap<String, Integer>();
            paramMap.put("id", 2);
            Blog myblog = new Blog();
            myblog.setId(3);

            blog = (Blog)session.selectOne("selectByPrimaryKey", 1);
            printBlog(blog);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    @Test
    public void test2() {
        BasicConfigurator.configure();
        SqlSession session = null;
        Blog blog = null;
        try {
            SqlSessionFactory factory = SqlMapperManager.getFactory();
            if (factory == null) {
                System.out.println("get SqlSessionFactory failed");
                return;
            }
            session = factory.openSession();
            BlogMapper mapper = session.getMapper(BlogMapper.class);
            blog = mapper.selectByPrimaryKey(3);
            printBlog(blog);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public void printBlog(Blog blog) {
        if (blog != null) {
            System.out.println("blog id is:" + blog.getId());
            System.out.println("blog title is:" + blog.getTitle());
            System.out.println("blog authorId is:" + blog.getAuthorId());
        } else {
            System.out.println("blog is null.");
        }

    }
}
