package cn.web.dao.impl;

import cn.web.dao.StudentDao;
import cn.web.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoImpl implements StudentDao {
    @Autowired
    private   SessionFactory sessionFactory;

    @Override
    public Student selectbyid(int id) {

//        Student student =(Student) sessionFactory.getCurrentSession().get(Student.class, id);
        Session session = sessionFactory.openSession();
        Student student =(Student)  session.get(Student.class, id);
        session.close();
        return student;
    }
}
