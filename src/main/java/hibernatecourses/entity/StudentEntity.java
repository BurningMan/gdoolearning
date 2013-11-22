package hibernatecourses.entity;

import java.io.Serializable;
import java.util.Set;

/**
 * User: Rodion
 * Date: 22.11.13
 * Time: 12:51
 */
public class StudentEntity  implements Serializable {
    private Integer id;
    private Set<AttendanceEntity> attendanceEntity;
    private Set<CourseEntity> courseSet;

    public Set<CourseEntity> getCourseSet() {
        return courseSet;
    }

    public void setCourseSet(Set<CourseEntity> courseSet) {
        this.courseSet = courseSet;
    }


    public Set<AttendanceEntity> getAttendanceEntity() {
        return attendanceEntity;
    }

    public void setAttendanceEntity(Set<AttendanceEntity> attendanceEntity) {
        this.attendanceEntity = attendanceEntity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentEntity that = (StudentEntity) o;

        return !(name != null ? !name.equals(that.name) : that.name != null);

    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
