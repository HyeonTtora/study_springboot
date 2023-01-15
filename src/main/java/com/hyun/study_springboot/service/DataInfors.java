package com.hyun.study_springboot.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.hyun.study_springboot.beans.BoardBeans;

public class DataInfors {
    public HashMap<String, String> getSearchFormData() {
        HashMap<String, String> searchForm = new HashMap<String, String>();
        searchForm.put("search_key", "Search Title");
        searchForm.put("name", "요주의랩!");
        searchForm.put("id", "ID0001");
        return searchForm;
    }

    public ArrayList<String> getTablesListWithString() {
        ArrayList<String> tablesListWithString = new ArrayList<String>();
        tablesListWithString.add("@mdo");
        tablesListWithString.add("@fat");
        tablesListWithString.add("@twitter");
        return tablesListWithString;
    }

    public HashMap<String, Object> getBundlesData() {
        DataInfors DataInfors = new DataInfors();
        HashMap<String, String> searchForm = DataInfors.getSearchFormData();
        ArrayList<String> tablesListWithString = DataInfors.getTablesListWithString();

        HashMap<String, Object> bundlesData = new HashMap<>();
        bundlesData.put("searchForm", searchForm);
        bundlesData.put("tablesListWithString", tablesListWithString);

        bundlesData.put("dataWithMamberBean", DataInfors.getDataWithMamberBean());
        bundlesData.put("dataListWithBoardBean", DataInfors.getDataListWithBoardBean());

        return bundlesData;
    }

    public BoardBeans getDataWithMamberBean(){
        BoardBeans boardBean = new BoardBeans();
        boardBean.setTitle("Mark");
        boardBean.setContent("Otto");
        boardBean.setUserName("@mdo");

        return boardBean;
    }

    public ArrayList<BoardBeans> getDataListWithBoardBean() {
        ArrayList<BoardBeans> membersList = new ArrayList<>();
        BoardBeans boardBean = new BoardBeans();
        boardBean.setTitle("Mark");
        boardBean.setContent("Otto");
        boardBean.setUserName("@mdo");
        membersList.add(boardBean);

        boardBean = new BoardBeans();
        boardBean.setTitle("Jacob");
        boardBean.setContent("Thornton");
        boardBean.setUserName("@fat");
        membersList.add(boardBean);

        boardBean = new BoardBeans();
        boardBean.setTitle("Larry");
        boardBean.setContent("Bird");
        boardBean.setUserName("@twitter");
        membersList.add(boardBean);
        return membersList;
    }
    
}
