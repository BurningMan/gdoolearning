package hibernatecourses.dao.MySqlDao;

import hibernatecourses.dao.interfaces.StudentDao;
import hibernatecourses.entity.StudentEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/** Created with IntelliJ IDEA. User: Andrii_Chupyr Date: 22.11.13 Time: 12:44 */

public class MySqlStudentDao implements StudentDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addStudent(StudentEntity student) {
        Session session = sessionFactory.getCurrentSession();
        session.save(student);
    }

    @Override
    public List<StudentEntity> getAllStudents() {
        Session session = sessionFactory.getCurrentSession();
        List<StudentEntity> studentEntities = session.createQuery("from StudentEntity").list();
        return studentEntities;
    }

    @Override
    public void deleteStudent(Integer studentId) {
        Session session = sessionFactory.getCurrentSession();
        StudentEntity student = (StudentEntity) session.load(
                StudentEntity.class, studentId);
        if (student != null) {
            session.delete(student);
        }
    }
}
