package cn.web.entity;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.json.annotations.JSON;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Us  extends ActionSupport {
    private Integer id;
    private String user;
    private Date date;
    private List<Us> us;


    public String js(){
        us=new ArrayList<>();
        for(int i=1;i<=10;i++){
            Us u=new Us(i,i+"",new Date());
            us.add(u);
        }
        return SUCCESS;
    }

    public List<Us> getUs() {
        return us;
    }

    public void setUs(List<Us> us) {
        this.us = us;
    }

    public Us() {
    }

    public Us(Integer id, String user, Date date) {
        this.id = id;
        this.user = user;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }
    @JSON(serialize = false)
    public void setUser(String user) {
        this.user = user;
    }
    @JSON(format = "yyyy-MM-dd")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
