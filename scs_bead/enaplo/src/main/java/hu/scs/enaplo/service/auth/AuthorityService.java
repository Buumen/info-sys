package hu.scs.enaplo.service.auth;

import java.util.List;

import hu.scs.enaplo.model.user.Authority;
import hu.scs.enaplo.model.user.UserRoleName;

public interface AuthorityService {

    void save(UserRoleName userRoleName);
    List<Authority> findById(Long id);
    List<Authority> findByName(String name);
}
