package com.hyun.study_springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping(value = {"","/","/main"}) // http://localhost:8080/homejsp

    public String main() {
        int i = 0;
        return "WEB-INF/views/main.jsp";
    }

    @RequestMapping(value = "/home") // http://localhost:8080/homejsp

    public void home() {
        int i = 0;
    }

    @RequestMapping(value = "/homejsp") // http://localhost:8080/homejsp

    public String homejsp() {
        int i = 0;
        return "WEB-INF/views/home.jsp";
    }

    @RequestMapping(value = "/homehtml") // http://localhost:8080/homejsp

    public String homehtml() {
        int i = 0;
        return "WEB-INF/views/home.html";
    }

}