package hu.scs.enaplo.service.auth;

import java.util.List;

import hu.scs.enaplo.dto.response.UserResponseDTO;
import hu.scs.enaplo.model.user.User;

public interface UserService {

    List<User> findAll();
    void resetCredentials(String username);
    User findById(Long id);
    User save(UserResponseDTO userResponseDTO);
    User update(Long id, UserResponseDTO userResponseDTO);
    String delete(Long user_id);
    boolean isUsernameUnique(String username);
}
