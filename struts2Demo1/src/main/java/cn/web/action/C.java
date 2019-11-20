package cn.web.action;

import com.opensymphony.xwork2.ActionSupport;

public class C extends ActionSupport {
    public C(){
        System.out.println("-----");
    }
    public String cc(){
        System.out.println("cccc");
        return SUCCESS;
    }
    public String dd(){
        System.out.println("dd");
        return SUCCESS;
    }
    public String ee(){
        System.out.println("ee");
        return SUCCESS;
    }
}
