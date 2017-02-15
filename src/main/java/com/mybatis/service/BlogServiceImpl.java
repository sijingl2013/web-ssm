package com.mybatis.service;

import com.mybatis.dao.BlogMapper;
import com.mybatis.model.Blog;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by sijingl on 2017-01-13.
 */
@Service("blogService")
public class BlogServiceImpl implements BlogService {
    @Resource
    private BlogMapper blogMapper;

    public BlogMapper getBlogMapper() {
        return blogMapper;
    }

    public void setBlogMapper(BlogMapper blogMapper) {
        this.blogMapper = blogMapper;
    }

    public int insert(Blog record) {
        return 0;
    }

    public int insertSelective(Blog record) {
        return 0;
    }

    public Blog selectByPrimaryKey(Integer id) {
        return blogMapper.selectByPrimaryKey(id);
    }
}
