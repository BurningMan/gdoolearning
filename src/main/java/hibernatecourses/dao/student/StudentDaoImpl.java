package hibernatecourses.dao.student;

import hibernatecourses.entity.StudentEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Andrii_Chupyr
 * Date: 22.11.13
 * Time: 12:44
 */
public class StudentDaoImpl implements StudentDao {


    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addStudent(StudentEntity student) {
        Session session = sessionFactory.openSession();
        sessionFactory.getCurrentSession();
        System.out.println(session.save(student));
        session.close();

    }

    @Override
    public List<StudentEntity> getAllStudents() {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        List<StudentEntity> studentEntities = session.createQuery("from StudentEntity").list();
        session.close();
        return studentEntities;
    }

    @Override
    public void deleteStudent(Integer studentId) {
    }
}
