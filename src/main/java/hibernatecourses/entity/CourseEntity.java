package hibernatecourses.entity;

import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Set;

/**
 * User: Rodion Date: 22.11.13 Time: 14:02
 */
public class CourseEntity implements Serializable {
    private Integer id;
    private SubjectEntity subject;
    private Timestamp startDate;
    private Timestamp finishDate;

    public SubjectEntity getSubjectEntity() {
        return subject;
    }

    public void setSubjectEntity(SubjectEntity subjectEntity) {
        this.subject = subjectEntity;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
    public String toString() {
        return "CourseEntity{" +
                "id=" + id +
                ", subjectEntity=" + subject +
                ", startDate=" + startDate +
                ", finishDate=" + finishDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CourseEntity)) return false;

        CourseEntity that = (CourseEntity) o;

        if (finishDate != null ? !finishDate.equals(that.finishDate) : that.finishDate != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;
        if (subject != null ? !subject.equals(that.subject) : that.subject != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (subject != null ? subject.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (finishDate != null ? finishDate.hashCode() : 0);
        return result;
    }
}
