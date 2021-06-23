package hu.scs.enaplo.service.auth.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.scs.enaplo.model.user.Authority;
import hu.scs.enaplo.model.user.UserRoleName;
import hu.scs.enaplo.repository.user.AuthorityRepository;
import hu.scs.enaplo.service.auth.AuthorityService;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthorityServiceImpl implements AuthorityService {

    @Autowired
    private AuthorityRepository authorityRepository;

    @Override
    public void save(UserRoleName userRoleName) {
        authorityRepository.saveAuth(userRoleName.toString());
    }

    @Override
    public List<Authority> findById(Long id) {
        Authority authority = authorityRepository
                .findById(id).orElse(null);
        List<Authority> authorities = new ArrayList<>();
        authorities.add(authority);
        return authorities;
    }

    @Override
    public List<Authority> findByName(String name) {
        Authority authority = getAuthority(name);
        List<Authority> authorities = new ArrayList<>();
        authorities.add(authority);
        return authorities;
    }

    private Authority getAuthority(String name) {
        for(Authority authority : authorityRepository.findAll()) {
            if(authority.getAuthority().equals(name)) {
                return authority;
            }
        }
        return null;
    }
}
