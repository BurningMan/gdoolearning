package hibernatecourses;

import hibernatecourses.dao.student.StudentDao;
import hibernatecourses.entity.StudentEntity;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * User: Rodion
 * Date: 22.11.13
 * Time: 14:20
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("hibernate-context.xml");

        // Retrieve the data source from the application context
        StudentDao studentDao = ctx.getBean("studentDao", StudentDao.class);
        List<StudentEntity> studentEntities = studentDao.getAllStudents();
        for (StudentEntity studentEntity : studentEntities) {
            System.out.println(studentEntity.getName());
        }
    }
}
