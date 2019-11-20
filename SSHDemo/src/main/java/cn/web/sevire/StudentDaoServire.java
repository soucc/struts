package cn.web.sevire;

import cn.web.entity.Student;
import cn.web.util.Page;

import java.util.Map;

public interface StudentDaoServire {

    public Page<Student> selectStudents(Integer currentPage, Map map);

}
