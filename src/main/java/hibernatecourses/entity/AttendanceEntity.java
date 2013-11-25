package hibernatecourses.entity;

import java.io.Serializable;
import java.util.Set;

/**
 * User: Rodion Date: 22.11.13 Time: 12:51
 */
public class AttendanceEntity implements Serializable {
    private Integer id;
    private StudentEntity student;
    private LessonEntity lesson;
    private Integer submissionId;

    public Integer getSubmissionId() {
        return submissionId;
    }

    public void setSubmissionId(Integer submissionId) {
        this.submissionId = submissionId;
    }

    public LessonEntity getLesson() {
        return lesson;
    }

    public void setLesson(LessonEntity lesson) {
        this.lesson = lesson;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AttendanceEntity that = (AttendanceEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (lesson != null ? !lesson.equals(that.lesson) : that.lesson != null) return false;
        if (student != null ? !student.equals(that.student) : that.student != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (student != null ? student.hashCode() : 0);
        result = 31 * result + (lesson != null ? lesson.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "AttendanceEntity{" +
                "id=" + id +
                ", student=" + student +
                ", lesson=" + lesson +
                ", submissionId=" + submissionId +
                '}';
    }
}
