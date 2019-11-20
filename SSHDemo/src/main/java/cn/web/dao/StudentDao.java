package cn.web.dao;

import cn.web.entity.Student;

import java.util.List;
import java.util.Map;

public interface StudentDao {


    public List<Student> selectStudents(Map map);

    public long count(Map map);


}
