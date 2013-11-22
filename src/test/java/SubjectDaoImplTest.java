import hibernatecourses.dao.student.StudentDao;
import hibernatecourses.entity.StudentEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * User: Rodion
 * Date: 22.11.13
 * Time: 13:54
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "hibernate-context.xml")
public class SubjectDaoImplTest {
    @Test
    public void testAddSubject() throws Exception {

    }

    @Test
    public void testGetAllSubjects() throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("hibernate-context.xml");
        StudentDao studentDao = ctx.getBean("studentDao", StudentDao.class);
        List<StudentEntity> studentEntity = studentDao.getAllStudents();
        System.out.println(studentEntity.size());
    }

    @Test
    public void testDeleteSubject() throws Exception {

    }
}
