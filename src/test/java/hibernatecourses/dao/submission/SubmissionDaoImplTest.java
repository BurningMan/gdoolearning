package hibernatecourses.dao.submission;

import hibernatecourses.entity.SubjectEntity;
import hibernatecourses.entity.SubmissionEntity;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * User: Rodion_Shkrobot
 * Date: 11/22/13
 * Time: 4:42 PM
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/hibernate-context.xml")
@Transactional
public class SubmissionDaoImplTest {
    private static final String FIRST_TEST_SUBJECT = "firstTestSubject";
    private static final String SECOND_TEST_SUBJECT = "secondTestSubject";
    private static SubmissionEntity firstTestSubmissionEntity;
    private static SubmissionEntity secondTestSubmissionEntity;
    @Autowired
    private ApplicationContext applicationContext;
    @Autowired
    private SubmissionDao submissionDao;

    @BeforeClass
    public void setUp() throws Exception {
        firstTestSubmissionEntity = new SubmissionEntity();
        secondTestSubmissionEntity = new SubmissionEntity();
        firstTestSubmissionEntity.setCourseId(1);
        secondTestSubmissionEntity.setCourseId(2);
        firstTestSubmissionEntity.setStudentId(1);
        secondTestSubmissionEntity.setStudentId(2);
    }

    @Test
    public void testAddSubmission() throws Exception {
        Assert.assertFalse(submissionDao.getAllSubmission().contains(firstTestSubmissionEntity));
        submissionDao.addSubmission(firstTestSubmissionEntity);
        Assert.assertTrue(submissionDao.getAllSubmission().contains(firstTestSubmissionEntity));
    }

    @Test
    public void testGetAllSubmission() throws Exception {
        Assert.assertEquals(submissionDao.getAllSubmission().size(), 0);
        submissionDao.addSubmission(firstTestSubmissionEntity);
        submissionDao.addSubmission(secondTestSubmissionEntity);
        List<SubmissionEntity> submissionEntities = submissionDao.getAllSubmission();
        Assert.assertTrue(submissionEntities.contains(firstTestSubmissionEntity));
        Assert.assertTrue(submissionEntities.contains(secondTestSubmissionEntity));
    }

    @Test
    public void testDeleteSubmission() throws Exception {
        submissionDao.addSubmission(firstTestSubmissionEntity);
        Assert.assertTrue(submissionDao.getAllSubmission().contains(firstTestSubmissionEntity));
        submissionDao.deleteSubmission(firstTestSubmissionEntity.getId());
        Assert.assertFalse(submissionDao.getAllSubmission().contains(firstTestSubmissionEntity));


    }
}
