package hu.scs.enaplo.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import hu.scs.enaplo.model.user.group.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {

    @Query(value = "SELECT teacher_id FROM teachers WHERE :teacher_id = id LIMIT 1", nativeQuery = true)
    @Transactional
    Long GetUserIdByTeacherId(@Param("teacher_id") Long teacher_id);
}
