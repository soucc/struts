package cn.web.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

public class User extends ActionSupport {
    private String user;
    private String password;
    private String mess;

    public String login(){
       if("admin".equals(user) && "111".equals(password)) {
           Map<String, Object> session = ActionContext.getContext().getSession();
           session.put("user",user);
           mess="欢迎光临";
           return "cc";
       }
        mess="你的帐户或密码错误";
        return SUCCESS;
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
