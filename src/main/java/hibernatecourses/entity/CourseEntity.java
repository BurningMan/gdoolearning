package hibernatecourses.entity;

/**
 * User: Rodion
 * Date: 22.11.13
 * Time: 12:51
 */
public class CourseEntity {
    private int id;

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
