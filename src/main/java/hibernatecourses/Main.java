package hibernatecourses;

import hibernatecourses.dao.MySqlDao.MySqlAttendanceDao;
import hibernatecourses.dao.interfaces.AttendanceDao;
import hibernatecourses.entity.AttendanceEntity;
import hibernatecourses.entity.LessonEntity;
import hibernatecourses.entity.StudentEntity;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Iterator;
import java.util.List;

/** User: Rodion Date: 22.11.13 Time: 14:20 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("hibernate-context.xml");
        AttendanceDao lessonDao = ctx.getBean("attendanceDao", MySqlAttendanceDao.class);
        List joinList = lessonDao.getAllAttendances();
        Iterator it = joinList.iterator();
        while (it.hasNext()) {
            Object[] objects = (Object[]) it.next();
            AttendanceEntity attendanceEntity = (AttendanceEntity) objects[0];
            StudentEntity studentEntity = (StudentEntity) objects[1];
            LessonEntity lessonEntity = (LessonEntity) objects[2];
            System.out.println("Att id:" + attendanceEntity.getId());
            System.out.println("Student name: " + studentEntity.getName());
            System.out.println("Lesson start time: " + lessonEntity.getStartTime());
            System.out.println("Lesson topic: " + lessonEntity.getTopic());
        }
    }
}
