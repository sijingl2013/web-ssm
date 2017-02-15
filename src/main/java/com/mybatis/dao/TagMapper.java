package com.mybatis.dao;

import com.mybatis.model.Tag;

public interface TagMapper {
    int insert(Tag record);

    int insertSelective(Tag record);
}