package cn.web.action;

import cn.web.entity.Student;
import cn.web.sevire.impl.StudentServire;
import cn.web.utils.Page;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.xml.ws.Action;
import java.util.HashMap;
import java.util.Map;

@Controller
public class StudentAction extends ActionSupport {
    @Autowired
    private StudentServire studentServire;

    private Integer currentPage;
    private String name;
    private Integer minage;
    private Integer maxage;
    private Page<Student> page;


    public String selectStudents(){
        if(currentPage==null){
            currentPage=1;
        }
        Map map=new HashMap();
        map.put("name",name);
        map.put("minage",minage);
        map.put("maxage",maxage);
         page = studentServire.selectStudents(currentPage, map);
        return SUCCESS;
    }

    public Page<Student> getPage() {
        return page;
    }

    public void setPage(Page<Student> page) {
        this.page = page;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMinage() {
        return minage;
    }

    public void setMinage(Integer minage) {
        this.minage = minage;
    }

    public Integer getMaxage() {
        return maxage;
    }

    public void setMaxage(Integer maxage) {
        this.maxage = maxage;
    }
}
