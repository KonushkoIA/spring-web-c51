package by.tms.dao;

import by.tms.entities.User;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    private List<User> userList;

    {
        userList = new ArrayList<>();
        userList.add(new User(1L, "user1", "user1","user1@gmail.com"));
        userList.add(new User(2L, "user2", "user2","user2@gmail.com"));
        userList.add(new User(3L, "user3", "user3","user3@gmail.com"));
    }

    public List<User> getAll() {
        return userList;
    }

    public User getById(int id) {
        return userList.stream().filter(user -> user.getId() == id).findAny().orElse(null);
    }

    public void save(User user) {
        user.setId(userList.size() + 1);
        userList.add(user);
    }
}
