package cn.web.action;

import com.opensymphony.xwork2.ActionSupport;

public class A extends ActionSupport {
    public String execute() throws Exception{
        System.out.println("111111");
        return SUCCESS;
    }
}
