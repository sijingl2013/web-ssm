package com.mybatis.service;

import com.mybatis.model.Blog;

/**
 * Created by sijingl on 2017-01-13.
 */
public interface BlogService {

    int insert(Blog record);

    int insertSelective(Blog record);

    Blog selectByPrimaryKey(Integer id);
}
