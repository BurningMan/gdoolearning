package hibernatecourses.dao.submission;

import hibernatecourses.entity.SubmissionEntity;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

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

    @Override
    public void addSubmission(SubmissionEntity submission) {
    }

    @Override
    public List<SubmissionEntity> getAllSubmission() {
        return null;
    }

    @Override
    public void deleteSubmission(Integer submissionId) {
    }
}
