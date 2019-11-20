package cn.web.action;
import cn.web.entity.stu;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class sts extends ActionSupport implements ModelDriven<stu> {
    private stu stu;
    @Override
    public stu getModel() {
        stu =new stu();
        return stu;
    }

    public String adds(){
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
