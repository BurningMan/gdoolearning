package hibernatecourses.dao.attendance;

import hibernatecourses.entity.AttendanceEntity;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Andrii_Chupyr
 * Date: 22.11.13
 * Time: 12:40
 */
public interface AttendanceDao {
    public void addAttendance (AttendanceEntity attendance);
    public List<AttendanceEntity> getAllAttendances ();
    public void deleteAttendance (Integer attendanceId);
}
