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

    // 항목 title, content, userName, date

    // crud : + list (/board) -> view (/board/view) -> list(/board/list)//

    // list (/board) -> form (/board/form ) ->

    @RequestMapping(value = { "/board/list", "/board" }) // http://localhost:8080/board/form
    public String list() {
        return "/WEB-INF/views/board/list.jsp";
    }

    @RequestMapping(value = "/board/view", method = RequestMethod.GET) // http://localhost:8080/view/form
    public String view() {
        return "/WEB-INF/views/board/view.jsp";
    }

    @RequestMapping(value = "/board/edit", method = RequestMethod.GET) // http://localhost:8080/edit/form
    public String edit() {
        return "/WEB-INF/views/board/edit.jsp";
    }

}
