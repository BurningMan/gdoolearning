package hibernatecourses.dao.MySqlDao;

import hibernatecourses.dao.interfaces.AttendanceDao;
import hibernatecourses.entity.AttendanceEntity;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created with IntelliJ IDEA. User: Andrii_Chupyr Date: 22.11.13 Time: 12:44
 */
@Transactional
public class MySqlAttendanceDao implements AttendanceDao {


    @Autowired
    private org.hibernate.SessionFactory sessionFactory;

    @Override
    public void addAttendance(AttendanceEntity attendance) {
        Session session = sessionFactory.getCurrentSession();
        session.save(attendance);
    }

    @Override
    public List<AttendanceEntity> getAllAttendances() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from AttendanceEntity").list();
    }

    @Override
    public void deleteAttendance(Integer attendanceId) {
        Session session = sessionFactory.getCurrentSession();
        AttendanceEntity attendance = (AttendanceEntity) session.load(AttendanceEntity.class, attendanceId);
        if (attendance != null) {
            session.delete(attendance);
        }
    }
}
