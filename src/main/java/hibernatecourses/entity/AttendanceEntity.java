package hibernatecourses.entity;

import java.io.Serializable;

/**
 * User: Rodion
 * Date: 22.11.13
 * Time: 12:51
 */
public class AttendanceEntity  implements Serializable {
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private Integer studentId;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    private Integer lessonId;

    public Integer getLessonId() {
        return lessonId;
    }

    public void setLessonId(Integer lessonId) {
        this.lessonId = lessonId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AttendanceEntity that = (AttendanceEntity) o;

        if (lessonId != that.lessonId) return false;
        return studentId == that.studentId;

    }

    @Override
    public int hashCode() {
        int result = studentId;
        result = 31 * result + lessonId;
        return result;
    }

    @Override
    public String toString() {
        return "AttendanceEntity{" +
                "id=" + id +
                ", studentId=" + studentId +
                ", lessonId=" + lessonId +
                '}';
    }
}
