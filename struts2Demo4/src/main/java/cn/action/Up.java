package cn.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.io.FileUtils;

import java.io.File;

public class Up extends ActionSupport {

    private String name;
    private File tx;
    private String txFileName;

    public String up() throws Exception{
        String path="d:/img";
        File file=new File(path);
        File file1=new File(file,txFileName);
        FileUtils.copyFile(tx,file1);
        return SUCCESS;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public File getTx() {
        return tx;
    }

    public void setTx(File tx) {
        this.tx = tx;
    }

    public String getTxFileName() {
        return txFileName;
    }

    public void setTxFileName(String txFileName) {
        this.txFileName = txFileName;
    }
}
