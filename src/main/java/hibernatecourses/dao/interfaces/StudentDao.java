package hibernatecourses.dao.interfaces;

import hibernatecourses.entity.StudentEntity;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Andrii_Chupyr
 * Date: 22.11.13
 * Time: 12:40
 */
public interface StudentDao {
    public void addStudent (StudentEntity student);
    public List<StudentEntity> getAllStudents ();
    public void deleteStudent (Integer studentId);
}
