package hibernatecourses.dao.subject;

import hibernatecourses.entity.StudentEntity;
import hibernatecourses.entity.SubjectEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.internal.SessionFactoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Andrii_Chupyr
 * Date: 22.11.13
 * Time: 12:44
 */
public class SubjectDaoImpl implements hibernatecourses.dao.subject.SubjectDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addSubject(SubjectEntity subject) {
        Session session = sessionFactory.getCurrentSession();
        session.save(subject);
    }

    @Override
    public List<SubjectEntity> getAllSubjects() {
        Session session = sessionFactory.getCurrentSession();
        List<SubjectEntity> studentEntities = session.createQuery("from SubjectEntity").list();
        return studentEntities;
    }

    @Override
    public void deleteSubject(Integer subjectId) {
        Session session = sessionFactory.getCurrentSession();
        SubjectEntity subject = (SubjectEntity) session.load(
                SubjectEntity.class, subjectId);
        if (subject != null) {
            session.delete(subject);
        }
    }
}
