package cn.web.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class CC  extends ActionSupport {

    public String web2(){
        HttpServletRequest request = ServletActionContext.getRequest();
        request.setAttribute("req","req");
        HttpSession session = request.getSession();
        session.setAttribute("session","session");
        return SUCCESS;
    }
}
