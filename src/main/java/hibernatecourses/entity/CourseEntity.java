package hibernatecourses.entity;

import java.security.Timestamp;
import java.util.Set;

/**
 * User: Rodion
 * Date: 22.11.13
 * Time: 14:02
 */
public class CourseEntity {
    private int id;
    private int subjectId;
    private Timestamp startDate;
    private Timestamp finishDate;
    private Set<SubmissionEntity> submissionEntity;
    private Set<LessonEntity> lessonEntity;

    public Set<LessonEntity> getLessonEntity() {
        return lessonEntity;
    }

    public void setLessonEntity(Set<LessonEntity> lessonEntity) {
        this.lessonEntity = lessonEntity;
    }

    public Set<SubmissionEntity> getSubmissionEntity() {
        return submissionEntity;
    }

    public void setSubmissionEntity(Set<SubmissionEntity> submissionEntity) {
        this.submissionEntity = submissionEntity;
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
                '}';
    }
}
