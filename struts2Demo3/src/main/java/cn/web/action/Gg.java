package cn.web.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

import java.util.Date;
import java.util.Map;


public class Gg extends ActionSupport  {

    public String web1(){
        ActionContext req = ActionContext.getContext();
        req.put("req","req");
        Map<String, Object> session = req.getSession();
        session.put("session","session");
        Map<String, Object> application = req.getApplication();
        application.put("application","application");
        ValueStack valueStack = req.getValueStack();
        valueStack.push(new Date());
        return SUCCESS;
    }



}
