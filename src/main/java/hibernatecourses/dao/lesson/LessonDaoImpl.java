package hibernatecourses.dao.lesson;

import hibernatecourses.entity.LessonEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
        Session session = sessionFactory.getCurrentSession();
        session.save(lesson);
    }

    @Override
    public java.util.List<LessonEntity> getAllLessons () {
        Session session = sessionFactory.getCurrentSession();
        List<LessonEntity> lessonEntities = session.createQuery("from LessonEntity").list();
        return lessonEntities;
    }

    @Override
    public void deleteLesson (Integer lessonId) {
        Session session = sessionFactory.getCurrentSession();
        LessonEntity lesson = (LessonEntity) session.load(LessonEntity.class, lessonId);
        if (lesson != null) {
            session.delete(lesson);
        }
    }
}
