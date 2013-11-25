package hibernatecourses.dao.MySqlDao;

import hibernatecourses.dao.interfaces.CourseDao;
import hibernatecourses.entity.CourseEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created with IntelliJ IDEA. User: Andrii_Chupyr Date: 22.11.13 Time: 12:44
 */
@Transactional
public class MySqlCourseDao implements CourseDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addCourse(CourseEntity course) {
        Session session = sessionFactory.getCurrentSession();
        session.save(course);
    }

    @Override
    public List<CourseEntity> getAllCourses() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from CourseEntity").list();
    }

    @Override
    public void deleteCourse(Integer courseId) {
        Session session = sessionFactory.getCurrentSession();
        CourseEntity course = (CourseEntity) session.load(CourseEntity.class, courseId);
        if (course != null) {
            session.delete(course);
        }
    }
}
