package hibernatecourses.dao.interfaces;

import hibernatecourses.entity.SubjectEntity;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Andrii_Chupyr
 * Date: 22.11.13
 * Time: 12:40
 */
public interface SubjectDao {
    public void addSubject (SubjectEntity subject);
    public List<SubjectEntity> getAllSubjects ();
    public void deleteSubject (Integer subjectId);
}
