package cn.web.controller;

import cn.web.entity.Student;
import cn.web.sevire.impl.StudentServire;
import cn.web.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class StudentController {
    @Autowired private StudentServire studentServire;


    @RequestMapping("/selectall")
    public String selectall(Integer currentPage,
                            String name,
                            Integer minage,
                            Integer maxage,
                            Model model
                            ){
        if(currentPage ==null){
            currentPage=1;
        }
        Map map=new HashMap();
        map.put("name",name);
        map.put("minage",minage);
        map.put("maxage",maxage);

        Page<Student> page = studentServire.selectStudents(currentPage, map);
        map.put("name",name);
        model.addAttribute("page",page);
        model.addAttribute("map",map);
        return "list";
    }

    @RequestMapping("/update")
    public String update(int id,Model model){

        return "update";
    }

}
