package hibernatecourses.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Set;

/**
 * User: Rodion Date: 22.11.13 Time: 14:02
 */
public class LessonEntity implements Serializable {
    private Integer id;
    private CourseEntity course;
    private Timestamp startTime;
    private String topic;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp date) {
        this.startTime = date;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public CourseEntity getCourse() {
        return course;
    }

    public void setCourse(CourseEntity course) {
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LessonEntity that = (LessonEntity) o;

        if (course != null ? !course.equals(that.course) : that.course != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (startTime != null ? !startTime.equals(that.startTime) : that.startTime != null) return false;
        if (topic != null ? !topic.equals(that.topic) : that.topic != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (course != null ? course.hashCode() : 0);
        result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
        result = 31 * result + (topic != null ? topic.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "LessonEntity{" +
                "id=" + id +
                ", course=" + course +
                ", startTime=" + startTime +
                ", topic='" + topic + '\'' +
                '}';
    }

}
