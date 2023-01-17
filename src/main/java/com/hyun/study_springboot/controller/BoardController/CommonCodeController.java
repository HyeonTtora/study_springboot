package com.hyun.study_springboot.controller.BoardController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hyun.study_springboot.dao.CommonCodeDao;

@Controller
@RequestMapping(value = "/commonCode")
public class CommonCodeController {

    @Autowired
    CommonCodeDao commonCodeDao;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String root() {
        return "redirect:/commonCode/list";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ModelAndView list(ModelAndView modelAndView) {

        Object result = commonCodeDao.getList();

        modelAndView.addObject("result", result);

        modelAndView.setViewName("commonCode/list");

        return modelAndView;
    }

}
