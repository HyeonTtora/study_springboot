package com.hyun.study_springboot.service;

import java.util.ArrayList;

import com.my.springboot.study_springboot.beans.NoticeBean;

public class NoticeInfo {
    // 게시글 정보를 NoticeBean에 담아서 Arraylist추가 & 리턴
    public ArrayList<NoticeBean> getNoticeList() {

        ArrayList<NoticeBean> noticeInfos = new ArrayList<>();

        NoticeBean noticeBean = new NoticeBean();
        noticeBean.setuId("1");
        noticeBean.setTitle("배고픈쿠로미구함");
        noticeBean.setWriter("까만쿠로미");
        noticeBean.setContent("배고픈 쿠로미는 이곳으로 모이세요");
        noticeBean.setDate("2023-01-11");
        noticeInfos.add(noticeBean);

        noticeBean = new NoticeBean();
        noticeBean.setuId("2");
        noticeBean.setTitle("추운쿠로미구함");
        noticeBean.setWriter("빨강쿠로미");
        noticeBean.setContent("추운 쿠로미는 이곳으로 모이세요");
        noticeBean.setDate("2023-01-12");
        noticeInfos.add(noticeBean);

        noticeBean = new NoticeBean();
        noticeBean.setuId("3");
        noticeBean.setTitle("우울한쿠로미구함");
        noticeBean.setWriter("보라쿠로미");
        noticeBean.setContent("우울한 쿠로미는 이곳으로 모이세요");
        noticeBean.setDate("2023-01-13");
        noticeInfos.add(noticeBean);

        return noticeInfos;

    }

    // uId와 동일한 NoticeBean 리턴하기
    public NoticeBean getNoticeBean(String uId) {

        NoticeBean noticeBean = null;
        ArrayList<NoticeBean> noticeInfos = getNoticeList();
        for (int i = 0; i < noticeInfos.size(); i++) {
            noticeBean = noticeInfos.get(i);
            if (noticeBean.getuId().equals(uId)) {
                break;
            }
        }
        return noticeBean;

    }
}
