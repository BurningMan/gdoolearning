package hibernatecourses.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Set;

/**
 * User: Rodion
 * Date: 22.11.13
 * Time: 14:02
 */
public class LessonEntity  implements Serializable {
    private int id;
    private int courseId;
    private Timestamp startTime;
    private Set<AttendanceEntity> attendanceEntity;

    public Set<AttendanceEntity> getAttendanceEntity() {
        return attendanceEntity;
    }

    public void setAttendanceEntity(Set<AttendanceEntity> attendanceEntity) {
        this.attendanceEntity = attendanceEntity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp date) {
        this.startTime = date;
    }

    private String topic;

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LessonEntity that = (LessonEntity) o;

        if (courseId != that.courseId) return false;
        if (startTime != null ? !startTime.equals(that.startTime) : that.startTime != null) return false;
        if (topic != null ? !topic.equals(that.topic) : that.topic != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = courseId;
        result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
        result = 31 * result + (topic != null ? topic.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "LessonEntity{" +
                "id=" + id +
                ", courseId=" + courseId +
                ", date=" + startTime +
                ", topic='" + topic + '\'' +
                '}';
    }
}
