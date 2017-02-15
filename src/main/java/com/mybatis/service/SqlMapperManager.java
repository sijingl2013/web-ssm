package com.mybatis.service;

/**
 * Created by sijingl on 2017-01-12.
 */
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
//单独使用mybatis使用，与spring整合不需要手动编写，同时mybatis的配置文件（SqlConfig.xml）也不需要了。
public class SqlMapperManager {
    private static SqlSessionFactory factory = null;
    private static String filename = "SqlConfig.xml";

    private SqlMapperManager(){}
    public static void initMapper(String sqlMapperFileName) {
        filename = sqlMapperFileName;
    }

    public static SqlSessionFactory getFactory() {
        try {
            if (factory == null) {
                Reader reader = Resources.getResourceAsReader(filename);
                SqlSessionFactoryBuilder builder =
                        new SqlSessionFactoryBuilder();
                factory = builder.build(reader);
                builder = null;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return factory;
    }
}
