package com.mybatis.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by sijingl on 2017-01-18.
 */
public class HelloWorldWithoutReturnModelAndViewController extends AbstractController {
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.getWriter().write("<a href=''>this</a>");
        return null;
    }
}
