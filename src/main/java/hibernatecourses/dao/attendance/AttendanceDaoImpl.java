package hibernatecourses.dao.attendance;

import hibernatecourses.entity.AttendanceEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.toplink.SessionFactory;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Andrii_Chupyr
 * Date: 22.11.13
 * Time: 12:44
 */
public class AttendanceDaoImpl implements AttendanceDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addAttendance (AttendanceEntity attendance) {
    }

    @Override
    public List<AttendanceEntity> getAllAttendances () {
        return null;
    }

    @Override
    public void deleteAttendance (Integer attendanceId) {
    }
}
