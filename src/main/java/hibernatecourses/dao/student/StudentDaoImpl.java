package hibernatecourses.dao.student;

import hibernatecourses.entity.StudentEntity;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Andrii_Chupyr
 * Date: 22.11.13
 * Time: 12:44
 */
public class StudentDaoImpl implements StudentDao {


    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addStudent (StudentEntity student) {
    }

    @Override
    public List<StudentEntity> getAllStudents () {
        return null;
    }

    @Override
    public void deleteStudent (Integer studentId) {
    }
}
