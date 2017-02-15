package com.mybatis.service;

import com.mybatis.model.Blog;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by sijingl on 2017-01-13.
 */
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class BlogServiceTest {

    private static Logger logger = Logger.getLogger(BlogServiceTest.class);
    @Resource
    private BlogService blogService;

    @Test
    public void test() {
        Blog blog = blogService.selectByPrimaryKey(1);
        printBlog(blog);
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
