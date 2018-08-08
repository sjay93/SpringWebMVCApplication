package com.yash.springmvcdemo.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

public class HelloController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        String message = httpServletRequest.getParameter("message");
        Map<String, String> map = new HashMap<>();
        map.put("msg", message);
        return new ModelAndView("welcome", map);
    }
}
