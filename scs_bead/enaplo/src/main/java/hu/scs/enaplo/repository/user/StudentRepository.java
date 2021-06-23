package hu.scs.enaplo.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import hu.scs.enaplo.model.user.group.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    @Transactional
    void deleteById(Long id);
}
