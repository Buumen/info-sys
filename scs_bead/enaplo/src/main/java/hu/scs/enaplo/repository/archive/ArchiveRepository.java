package hu.scs.enaplo.repository.archive;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hu.scs.enaplo.model.archive.Archive;

@Repository
public interface ArchiveRepository extends JpaRepository<Archive, Long> {
}
