package hibernatecourses.dao.MySqlDao;

import hibernatecourses.dao.interfaces.CourseDao;
import hibernatecourses.entity.CourseEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * User: Rodion
 * Date: 22.11.13
 * Time: 23:33
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/hibernate-context.xml")
@Transactional
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
public class MySqlCourseDaoTest {

    @Autowired
    private ApplicationContext applicationContext;
    @Autowired
    private CourseDao courseDao;

    @Test
    public void testGetAllLessons() throws Exception {
        List<CourseEntity> courseEntities = courseDao.getAllCourses();
        for (CourseEntity courseEntity : courseEntities) {
            System.out.println(courseEntities);
        }
    }
}
