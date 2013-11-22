package hibernatecourses.dao.submission;

import hibernatecourses.entity.SubmissionEntity;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Andrii_Chupyr
 * Date: 22.11.13
 * Time: 12:40
 */
public interface SubmissionDao {
    public void addSubmission (SubmissionEntity submission);
    public List<SubmissionEntity> getAllSubmission ();
    public void deleteSubmission (Integer submissionId);
}
