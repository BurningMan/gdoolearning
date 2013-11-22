package hibernatecourses.dao.course;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Andrii_Chupyr
 * Date: 22.11.13
 * Time: 12:44
 */
public class CourseDaoImpl implements CourseDao {


    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addCourse (CourseEntity course) {
    }

    @Override
    public List<hibernatecourses.entity.CourseEntity> getAllCourses () {
        return null;
    }

    @Override
    public void deleteCourse (Integer courseId) {
    }
}
