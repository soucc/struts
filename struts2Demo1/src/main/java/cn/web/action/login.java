package cn.web.action;

import com.opensymphony.xwork2.ActionSupport;

public class login extends ActionSupport {
    private String user;
    private String password;
    private String mess;
    private String cs;

    public String cc(){
        System.out.println(cs);
        System.out.println(user);
        System.out.println(password);
        if("admin".equals(user) && "111111".equals(password)){
            mess="true";
            return SUCCESS;
        }else {
            mess="false";
            return "cc";
        }

    }

    public String getCs() {
        return cs;
    }

    public void setCs(String cs) {
        this.cs = cs;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMess() {
        return mess;
    }

    public void setMess(String mess) {
        this.mess = mess;
    }
}
