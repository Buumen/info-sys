package hu.scs.enaplo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hu.scs.enaplo.model.Report;

@Repository
public interface ReportRepository extends JpaRepository<Report, Long> {
}
