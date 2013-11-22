package hibernatecourses.dao.lesson;

import hibernatecourses.entity.LessonEntity;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created with IntelliJ IDEA.
 * User: Andrii_Chupyr
 * Date: 22.11.13
 * Time: 12:44
 */
public class LessonDaoImpl implements LessonDao {


    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addLesson (LessonEntity lesson) {
    }

    @Override
    public java.util.List<LessonEntity> getAllLessons () {
        return null;
    }

    @Override
    public void deleteLesson (Integer lessonId) {
    }
}
