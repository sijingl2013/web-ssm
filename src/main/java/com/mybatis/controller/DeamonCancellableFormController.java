package com.mybatis.controller;

import com.mybatis.model.UserModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.CancellableFormController;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by sijingl on 2017-01-18.
 */
public class DeamonCancellableFormController extends CancellableFormController {

    Logger logger = LoggerFactory.getLogger(getClass());
    public DeamonCancellableFormController() {
        setCommandClass(UserModel.class);
        setCommandName("user");
    }

    @Override
    protected Object formBackingObject(HttpServletRequest request) throws Exception {
        UserModel user = new UserModel();
        user.setUserName("请输入用户名");
        return user;
    }

    @Override
    protected Map referenceData(HttpServletRequest request) throws Exception {
        Map map = new HashMap();
        map.put("cityList", Arrays.asList("山东", "北京", "上海"));
        logger.debug("=========cityList:" + Arrays.asList("山东", "北京", "上海"));
        return map;
    }

    @Override
    protected void doSubmitAction(Object command) throws Exception {
        UserModel user = (UserModel) command;
        //TODO 调用业务对象处理
        System.out.println(user);
    }

    @Override
    protected ModelAndView onCancel(Object command) throws Exception {
        UserModel user = (UserModel) command;
        //TODO 调用业务对象处理
        System.out.println(user);
        return super.onCancel(command);
    }
}
