package cn.web.action;

import com.opensymphony.xwork2.Action;

public class B implements Action {
    @Override
    public String execute() throws Exception {
        System.out.println("bbbbbb");
        return SUCCESS;
    }
}
