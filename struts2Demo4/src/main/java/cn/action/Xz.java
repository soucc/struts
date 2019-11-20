package cn.action;

import com.opensymphony.xwork2.ActionSupport;
import com.sun.xml.internal.messaging.saaj.util.Base64;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class Xz extends ActionSupport {
    private String name;
    private String ct;
    private FileInputStream is;
    private String cd;


    public String xz() throws Exception{
        System.out.println(name);
        ct= ServletActionContext.getServletContext().getMimeType(name);

        is=new FileInputStream(new File("d:/img",name));

        cd="attachment;filename="+setDownloadFileName(name,ServletActionContext.getRequest());
        return SUCCESS;
    }

    public String setDownloadFileName(String fileName,HttpServletRequest request) throws  Exception {
        try {
            if (request.getHeader("User-Agent").toLowerCase().indexOf("firefox") > 0) {//火狐浏览器
                fileName = "=?UTF-8?B?"+(new String(Base64.encode(fileName.getBytes("UTF-8")))) + "?=";
            } else {				//其它浏览器
                fileName = URLEncoder.encode(fileName, "UTF-8");
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return fileName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCt() {
        return ct;
    }

    public void setCt(String ct) {
        this.ct = ct;
    }

    public FileInputStream getIs() {
        return is;
    }

    public void setIs(FileInputStream is) {
        this.is = is;
    }

    public String getCd() {
        return cd;
    }

    public void setCd(String cd) {
        this.cd = cd;
    }
}
