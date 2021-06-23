package hu.scs.enaplo.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import hu.scs.enaplo.model.user.Authority;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority, Long> {

    Authority findByName(String name);

    @Modifying
    @Query(value = "INSERT INTO authorities(name) VALUES (:roleName)", nativeQuery = true)
    @Transactional
    void saveAuth(@Param("roleName") String roleName);
}
