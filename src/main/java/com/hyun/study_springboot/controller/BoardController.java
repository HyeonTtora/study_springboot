package com.hyun.study_springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class BoardController {

    @RequestMapping(value = "/board/form", method = RequestMethod.GET) // http://localhost:8080/board/form
    public String form() {
        return "/WEB-INF/views/board/form.jsp";
    }

    @RequestMapping(value = "/board/form", method = RequestMethod.POST) // http://localhost:8080/board/form
    public String formPost() {
        return "/WEB-INF/views/board/list.jsp";
    }

}
