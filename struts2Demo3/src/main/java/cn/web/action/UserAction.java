package cn.web.action;

import cn.web.entity.User;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
    private User user;
    private String mess;

    public String login(){
        if("admin".equals(user.getUser()) && "111".equals(user.getPassword())){
            System.out.println(user.toString());
            mess="false";
            return SUCCESS;
        }else {
            System.out.println(user.toString());
            mess="true";
            return "cc";
        }
    }

    public String getMess() {
        return mess;
    }

    public void setMess(String mess) {
        this.mess = mess;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
