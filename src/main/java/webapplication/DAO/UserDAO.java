package webapplication.DAO;

import webapplication.model.User;

import java.util.List;

public interface UserDAO {
    List<User> getAllUsers();
    User getUser(long id);
    void addUser(User user);
    void deleteUser(User user);
    void editUser(User user);

}
