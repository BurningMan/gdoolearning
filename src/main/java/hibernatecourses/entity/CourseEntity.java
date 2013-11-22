package hibernatecourses.entity;

import java.io.Serializable;

import java.sql.Timestamp;
import java.util.Set;

/**
 * User: Rodion
 * Date: 22.11.13
 * Time: 14:02
 */
public class CourseEntity  implements Serializable {
    private int id;
    private int subjectId;
    private Timestamp startDate;
    private Timestamp finishDate;
    private Set<LessonEntity> lessonEntity;
    private Set<StudentEntity> studentEntity;

    public Set<StudentEntity> getStudentEntity() {
        return studentEntity;
    }

    public void setStudentEntity(Set<StudentEntity> studentEntity) {
        this.studentEntity = studentEntity;
    }

    public Set<LessonEntity> getLessonEntity() {
        return lessonEntity;
    }

    public void setLessonEntity(Set<LessonEntity> lessonEntity) {
        this.lessonEntity = lessonEntity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    public Timestamp getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Timestamp finishDate) {
        this.finishDate = finishDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CourseEntity that = (CourseEntity) o;

        if (subjectId != that.subjectId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return subjectId;
    }

    @Override
    public String toString() {
        return "CourseEntity{" +
                "id=" + id +
                ", subjectId=" + subjectId +
                ", startDate=" + startDate +
                ", finishDate=" + finishDate +
                ", lessonEntity=" + lessonEntity +
                ", studentEntity=" + studentEntity +
                '}';
    }
}
