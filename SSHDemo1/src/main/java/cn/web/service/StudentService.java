package cn.web.service;

import cn.web.dao.StudentDao;
import cn.web.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class StudentService {
    @Autowired
    private StudentDao studentDao;

    public Student selectbyid(int id){
        return studentDao.selectbyid(id);
    }
}
