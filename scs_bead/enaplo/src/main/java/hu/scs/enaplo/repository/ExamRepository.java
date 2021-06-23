package hu.scs.enaplo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import hu.scs.enaplo.model.Exam;

@Repository
public interface ExamRepository extends JpaRepository<Exam, Long> {
}
