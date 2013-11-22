package hibernatecourses.dao.submission;

import hibernatecourses.entity.StudentEntity;
import hibernatecourses.entity.SubjectEntity;
import hibernatecourses.entity.SubmissionEntity;
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
public class SubmissionDaoImpl implements SubmissionDao {


    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    @Override
    public void addSubmission(SubmissionEntity submission) {
        Session session = sessionFactory.getCurrentSession();
        session.save(submission);
    }

    @Transactional
    @Override
    public List<SubmissionEntity> getAllSubmission() {
        Session session = sessionFactory.getCurrentSession();
        List<SubmissionEntity> studentEntities = session.createQuery("from SubmissionEntity").list();
        return studentEntities;
    }

    @Transactional
    @Override
    public void deleteSubmission(Integer submissionId) {
        Session session = sessionFactory.getCurrentSession();
        SubmissionEntity submission = (SubmissionEntity) session.load(
                StudentEntity.class, submissionId);
        if (submission != null) {
            session.delete(submission);
        }
    }
}
