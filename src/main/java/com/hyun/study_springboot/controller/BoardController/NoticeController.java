package com.hyun.study_springboot.controller.BoardController;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hyun.study_springboot.service.NoticeInfo;
import com.my.springboot.study_springboot.beans.NoticeBean;

@Controller
@RequestMapping(value = "/notice")
// 상위 url 모든 RequestMapping의 앞에 작성댐
public class NoticeController {

    // Root 서블릿 - /notice >> /notice/list - 던지는 용도 / 리다이렉션 / URL 변화
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String root() {
        return "redirect:/notice/list";
    }

    // list(/notice/list)
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ModelAndView list(ModelAndView modelAndView) {

        // notice bean 객체를 arrylist로 받음
        NoticeInfo noticeInfo = new NoticeInfo();
        ArrayList<NoticeBean> noticeList = noticeInfo.getNoticeList();
        // 모델엔뷰에담음
        modelAndView.addObject("noticeList", noticeList);
        // 뷰네임설정
        modelAndView.setViewName("notice/list");
        // 리턴
        return modelAndView;

    }

    // view(/notice/view)
    @RequestMapping(value = "/view/{uId}", method = RequestMethod.GET)
    public ModelAndView view(@PathVariable String uId, ModelAndView modelAndView) {
        // 정보 가져오기 위해 noticeinfo 객체생성
        NoticeInfo noticeInfo = new NoticeInfo();
        // uid에 해당하는 게시글 정보 가져오기
        NoticeBean noticeBean = noticeInfo.getNoticeBean(uId);
        // 가져온 정보 모델 & 뷰 담기
        modelAndView.addObject("noticeBean", noticeBean);
        // 뷰네임설정
        modelAndView.setViewName("notice/view");
        // 리턴
        return modelAndView;

    }

    // edit
    @RequestMapping(value = "/edit/{uId}", method = RequestMethod.POST)
    public ModelAndView edit(@PathVariable String uId, ModelAndView modelAndView) {

        // 1. 정보를 가져오기 위해 NoticeInfo 객체 생성
        NoticeInfo noticeInfo = new NoticeInfo();

        // 2. uId 에 해당하는 게시글의 정보를 가져옴
        NoticeBean noticeBean = noticeInfo.getNoticeBean(uId);

        // 3. 가져온 정보를 모델&뷰에 담음
        modelAndView.addObject("noticeBean", noticeBean);

        // 4. 모델&뷰의 뷰네임을 설정해줌 - jsp 파일의 경로
        modelAndView.setViewName("notice/edit");

        // 5. 리턴
        return modelAndView;
    }

    // edit done (db )
    @RequestMapping(value = "/edit/done", method = RequestMethod.POST)
    public String editdone(NoticeBean noticeBean, ModelAndView modelAndView) {

        // 1. Bean에 Form 정보를 담아서 받아옴
        System.out.println(noticeBean.getuId());
        System.out.println(noticeBean.getTitle());
        System.out.println(noticeBean.getContent());
        System.out.println(noticeBean.getWriter());
        System.out.println(noticeBean.getDate());

        // 2. 등록 로직을 완료 하고 view 로 리다이렉션 - DB 작업 필요
        return "redirect:/notice/view/" + noticeBean.getuId();
    }

    // form
    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public ModelAndView form(ModelAndView modelAndView) {
        modelAndView.setViewName("notice/form");
        return modelAndView;
    }

    //save (db )
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String form(NoticeBean noticeBean, ModelAndView modelAndView) {
    
        System.out.println(noticeBean.getuId());
        System.out.println(noticeBean.getTitle());
        System.out.println(noticeBean.getContent());
        System.out.println(noticeBean.getWriter());
        System.out.println(noticeBean.getDate());

        return "redirect:/notice/list";
    }
    
}
