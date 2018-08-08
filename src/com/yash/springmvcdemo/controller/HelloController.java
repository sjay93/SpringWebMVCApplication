package com.yash.springmvcdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@org.springframework.stereotype.Controller
public class HelloController {
//    @Override
//    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
//        String message = request.getParameter("message");
//        Map<String, String> map = new HashMap<>();
//        map.put("msg", message);
//        return new ModelAndView("welcome", map);
//    }

    @RequestMapping("/hello.ds")
    public ModelAndView helloProcess() {
        String message = "Hello Welcome";
        Map<String, String> helloMap = new HashMap<>();
        helloMap.put("msg", message);
        helloMap.put("msg1", "Hello 1 Welcome");
        return new ModelAndView("welcome", helloMap);
    }

    @RequestMapping("/hi.ds")
    public ModelAndView hiProcess() {
        String message = "Hi Welcome";
        Map<String, String> hiMap = new HashMap<>();
        hiMap.put("msg", message);
        hiMap.put("msg1", "Hi 1 Welcome");
        return new ModelAndView("welcome", hiMap);
    }
}
