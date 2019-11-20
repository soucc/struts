package cn.web.dao.impl;

import cn.web.dao.StudentDao;
import cn.web.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.TransactionScoped;
import java.util.List;
import java.util.Map;

@Repository
public class StudentDaoImpl implements StudentDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Student> selectStudents( Map map) {
        Session session = sessionFactory.getCurrentSession();
        StringBuffer stringBuffer=new StringBuffer("from Student where 1=1");
        if(map.get("name")!=null && !"".equals(map.get("name"))){
            map.put("name","%"+map.get("name")+"%");
            stringBuffer.append(" and name like :name");
        }
        if(map.get("minage")!=null && !"".equals(map.get("minage"))){
            stringBuffer.append(" and age>= :minage");
        }
        if(map.get("maxage")!=null && !"".equals(map.get("maxage"))){
            stringBuffer.append(" and age<= :maxage");
        }
        List<Student> list = session.createQuery(stringBuffer.toString())
                .setFirstResult((int) map.get("startIndex"))
                .setMaxResults((int) map.get("pageSize"))
                .setProperties(map)
                .list();
        return list;
    }

    @Override
    public long count( Map map) {
        Session session = sessionFactory.getCurrentSession();
        StringBuffer stringBuffer=new StringBuffer("select count(1) from Student where 1=1");
        if(map.get("name")!=null && !"".equals(map.get("name"))){
           // map.put("name","%"+map.get("name")+"%");
            stringBuffer.append(" and name like :name");
        }
        if(map.get("minage")!=null && !"".equals(map.get("minage"))){
            stringBuffer.append(" and age>= :minage");
        }
        if(map.get("maxage")!=null && !"".equals(map.get("maxage"))){
            stringBuffer.append(" and age<= :maxage");
        }
        long num =(long) session.createQuery(stringBuffer.toString())
                .setProperties(map)
                .uniqueResult();
        return num;
    }
}
