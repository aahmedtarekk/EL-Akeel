package repo;

import database.User;

public interface UserRepo {
    User getUserById(int id);
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(User user);
}