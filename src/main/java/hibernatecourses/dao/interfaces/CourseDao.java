package hibernatecourses.dao.interfaces;

import hibernatecourses.entity.CourseEntity;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/** Created with IntelliJ IDEA. User: Andrii_Chupyr Date: 22.11.13 Time: 12:40 */
public interface CourseDao {
    public void addCourse(CourseEntity course);
    public List<hibernatecourses.entity.CourseEntity> getAllCourses();
    public void deleteCourse(Integer courseId);
}
