package com.tekup.project_erh.Service;

import java.util.List;
import java.util.Optional;
import com.tekup.project_erh.model.User;

public interface UserServices {
    User saveUser(User U);
    void deleteUser(User U);
    User getUser(Long id);
    List<User> getAllUsers();
    List<User> findActivatedUsers(boolean activated);
    User addUser(User user);
    boolean userExist(String email);
    Optional<User> findUserByEmail(String email);
}
