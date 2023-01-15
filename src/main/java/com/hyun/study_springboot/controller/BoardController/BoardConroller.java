package com.hyun.study_springboot.controller.BoardController;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hyun.study_springboot.service.DataInfors;
import com.my.springboot.study_springboot.beans.BoardBean;

@Controller
@RequestMapping(value = "/board")
public class BoardConroller {

    @RequestMapping(value = { "", "/list" }, method = RequestMethod.GET)
    public ModelAndView list() {

        // 1. ModelAndView 생성
        ModelAndView modelAndView = new ModelAndView();

        // 2. Object 추가 == .addObject(Name, Value)
        modelAndView.addObject("firstString", "firstValue");

        // 3. DataInfo 를 가져와 Object 추가
        DataInfors dataInfors = new DataInfors();
        ArrayList<BoardBean> boardList = dataInfors.getDataListWithBoardBean();
        modelAndView.addObject("boardList", boardList);

        // 4. Model 정보와 View 정보 전달
        modelAndView.setViewName("board/list");
        return modelAndView; // --> Dispatcher Servlet }
    }

    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public ModelAndView form() {

        // Writing Out
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("board/form");
        return modelAndView; // --> Dispatcher Servlet }
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public ModelAndView insert(ModelAndView modelAndView) {

        modelAndView.setViewName("board/list");
        return modelAndView; // --> Dispatcher Servlet }
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public ModelAndView edit(/* @RequestParam String title, */ModelAndView modelAndView) {
        // System.out.println(title);
        // DataInfors dataInfors = new DataInfors();
        // BoardBean boardBean = dataInfors.getDataWithMamberBean(title);
        // modelAndView.addObject("boardBean", boardBean);
        modelAndView.setViewName("board/edit");
        return modelAndView;
    }

    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public ModelAndView view(@RequestParam String title, ModelAndView modelAndView) {
        System.out.println(title);
        DataInfors dataInfors = new DataInfors();
        BoardBean boardBean = dataInfors.getDataWithMamberBean(title);
        modelAndView.addObject("boardBean", boardBean);
        modelAndView.setViewName("board/view");
        return modelAndView;
    }

}