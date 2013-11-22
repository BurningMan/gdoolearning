package hibernatecourses.dao.lesson;

/**
 * Created with IntelliJ IDEA.
 * User: Andrii_Chupyr
 * Date: 22.11.13
 * Time: 12:40
 */
public interface LessonDao {
    public void addLesson (LessonEntity lesson);
    public java.util.List<LessonEntity> getAllLessons ();
    public void deleteLesson (Integer lessonId);
}
