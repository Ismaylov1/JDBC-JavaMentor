package web.DAO;

import web.model.User;

import java.util.List;

public interface UserDAO {

    void add(User user);

    void updateUsers(User user);

    void remove(User user);

    User getUserById(long id);

    List<User> listUsers();

}


