package cn.web.sevire.impl;

import cn.web.dao.impl.StudentDaoImpl;
import cn.web.entity.Student;
import cn.web.sevire.StudentDaoServire;
import cn.web.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class StudentServire implements StudentDaoServire {
    @Autowired
   private StudentDaoImpl studentDao;

    @Override
    public Page<Student> selectStudents(Integer currentPage,Map map) {
        int pageSize=3;
        int count = studentDao.count(map);
        Page<Student> page=new Page<Student>(currentPage,pageSize,count);
        List<Student> list = studentDao.selectStudents(map);
        page.setDataList(list);
        return page;
    }


}
