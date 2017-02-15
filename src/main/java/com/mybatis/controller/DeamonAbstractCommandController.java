package com.mybatis.controller;

import com.mybatis.model.UserModel;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by sijingl on 2017-01-18.
 */
public class DeamonAbstractCommandController extends AbstractCommandController {
    @Override
    protected ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object command, BindException errors) throws Exception {
        UserModel um = (UserModel)command;
        ModelAndView mv = new ModelAndView();
        mv.setViewName("abstractCommand");
        mv.addObject("user", um);
        return mv;
    }
}
