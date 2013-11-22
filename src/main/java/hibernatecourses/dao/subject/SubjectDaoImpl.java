package hibernatecourses.dao.subject;

import hibernatecourses.entity.SubjectEntity;
import org.hibernate.SessionFactory;
import org.hibernate.internal.SessionFactoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;

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
    public void addSubject (SubjectEntity subject) {
    }

    @Override
    public List<SubjectEntity> getAllSubjects () {
        return null;
    }

    @Override
    public void deleteSubject (Integer subjectId) {
    }
}
