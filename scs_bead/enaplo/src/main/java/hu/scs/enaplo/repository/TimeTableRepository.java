package hu.scs.enaplo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hu.scs.enaplo.model.TimeTableEntity;

@Repository
public interface TimeTableRepository extends JpaRepository<TimeTableEntity, Long> {
}
