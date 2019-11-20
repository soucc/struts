package cn.web.sevire;

import cn.web.entity.Student;
import cn.web.utils.Page;

import java.util.List;
import java.util.Map;

public interface StudentDaoServire {

    public Page<Student> selectStudents(Integer currentPage,Map map);

}
