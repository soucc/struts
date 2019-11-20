package cn.web.action;
import cn.web.entity.stu;
import com.opensymphony.xwork2.ActionSupport;

public class st extends ActionSupport {
    private stu stu;


    public String add(){
        System.out.println(stu.toString());
        return SUCCESS;
    }

    public cn.web.entity.stu getStu() {
        return stu;
    }

    public void setStu(cn.web.entity.stu stu) {
        this.stu = stu;
    }
}
