package cn.web.sevire.impl;

import cn.web.dao.impl.StudentDaoImpl;
import cn.web.entity.Student;
import cn.web.sevire.StudentDaoServire;
import cn.web.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.transaction.TransactionScoped;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class StudentServire implements StudentDaoServire {
    @Autowired
   private StudentDaoImpl studentDao;

    @Override
    public Page<Student> selectStudents(Integer currentPage,Map map) {
        int pageSize=3;
        int count =(int) studentDao.count(map);
        Page<Student> page=new Page<Student>(currentPage,pageSize,count);
        int startIndex = page.getStartIndex();
        map.put("pageSize",pageSize);
        map.put("startIndex",startIndex);
        List<Student> list = studentDao.selectStudents(map);
        page.setDataList(list);
        return page;
    }


}
