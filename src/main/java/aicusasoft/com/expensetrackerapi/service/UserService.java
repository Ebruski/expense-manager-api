package aicusasoft.com.expensetrackerapi.service;

import aicusasoft.com.expensetrackerapi.entity.User;
import aicusasoft.com.expensetrackerapi.entity.UserModel;

public interface UserService {

    User createUser(UserModel user);

    User readUser();

    User updateUser(UserModel user);

    void deleteUser();

    User getLoggedInUser();
}
