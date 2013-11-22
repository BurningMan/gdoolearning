package hibernatecourses.entity;

import java.io.Serializable;

/**
 * User: Rodion
 * Date: 22.11.13
 * Time: 12:51
 */
public class AttendanceEntity  implements Serializable {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int studentId;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    private int lessonId;

    public int getLessonId() {
        return lessonId;
    }

    public void setLessonId(int lessonId) {
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
