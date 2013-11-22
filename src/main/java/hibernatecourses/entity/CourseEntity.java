package hibernatecourses.entity;

import java.util.Set;

/**
 * User: Rodion
 * Date: 22.11.13
 * Time: 14:02
 */
public class CourseEntity {
    private int id;
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

    private int subjectId;

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
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
