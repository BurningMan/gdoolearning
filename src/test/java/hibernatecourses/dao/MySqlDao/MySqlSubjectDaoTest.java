package hibernatecourses.dao.MySqlDao;

import hibernatecourses.dao.interfaces.SubjectDao;
import hibernatecourses.entity.SubjectEntity;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * User: Rodion
 * Date: 22.11.13
 * Time: 13:54
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/hibernate-context.xml")
@Transactional
public class MySqlSubjectDaoTest {

    private static final String FIRST_TEST_SUBJECT = "firstTestSubject";
    private static final String SECOND_TEST_SUBJECT = "secondTestSubject";
    private SubjectEntity firstTestSubject;
    private SubjectEntity secondTestSubject;
    @Autowired
    private ApplicationContext applicationContext;
    @Autowired
    private SubjectDao subjectDao;

    @Before
    public void setUp() throws Exception {
        firstTestSubject = new SubjectEntity();
        secondTestSubject = new SubjectEntity();
        firstTestSubject.setName(FIRST_TEST_SUBJECT);
        secondTestSubject.setName(SECOND_TEST_SUBJECT);
    }

    @Test
    public void testAddSubject() throws Exception {
        Assert.assertEquals(subjectDao.getAllSubjects().size(),0);
        addSubject(firstTestSubject);
        Assert.assertTrue(subjectDao.getAllSubjects().contains(firstTestSubject));
    }

    @Test
    public void testGetAllSubjects() throws Exception {
        Assert.assertEquals(subjectDao.getAllSubjects().size(),0);
        addSubject(firstTestSubject);
        addSubject(secondTestSubject);
        List<SubjectEntity> subjectEntities = subjectDao.getAllSubjects();
        Assert.assertTrue(subjectEntities.contains(firstTestSubject));
        Assert.assertTrue(subjectEntities.contains(secondTestSubject));
    }

    @Test
    public void testDeleteSubject() throws Exception {
        addSubject(firstTestSubject);
        Assert.assertTrue(subjectDao.getAllSubjects().contains(firstTestSubject));
        deleteSubject(firstTestSubject);
        Assert.assertFalse(subjectDao.getAllSubjects().contains(firstTestSubject));
    }

    private void addSubject(SubjectEntity subjectEntity) {
        subjectDao.addSubject(subjectEntity);
    }

    private void deleteSubject(SubjectEntity subjectEntity) {
        subjectDao.deleteSubject(subjectEntity.getId());
    }

}
