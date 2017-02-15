package com.mybatis.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.LastModified;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by sijingl on 2017-01-18.
 */
@Controller
@RequestMapping("/DeamonAbstractController")
public class DeamonAbstractController extends AbstractController implements LastModified {
    private Logger logger = LoggerFactory.getLogger(getClass());
    private long lastModified;
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
//        ModelAndView mv = new ModelAndView();
//        mv.addObject("message", "Hello World");
//        mv.setViewName("hello");
//        return mv;
        response.getWriter().write("<a href=''>this</a>");
        return null;
    }

    @Override
    public long getLastModified(HttpServletRequest request) {
        logger.debug("==============generate last modify time");
        if (lastModified == 0) {
            lastModified = System.currentTimeMillis();
        }
        return lastModified;
    }
}
