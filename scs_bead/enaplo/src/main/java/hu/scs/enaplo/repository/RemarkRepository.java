package hu.scs.enaplo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hu.scs.enaplo.model.Remark;

@Repository
public interface RemarkRepository extends JpaRepository<Remark, Long> {
}
