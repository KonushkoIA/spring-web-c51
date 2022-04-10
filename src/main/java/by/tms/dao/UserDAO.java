package by.tms.dao;

import by.tms.entities.User;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    private List<User> userList;

    {
        userList = new ArrayList<>();
        userList.add(new User(1L, "user1", "user1"));
        userList.add(new User(2L, "user2", "user2"));
        userList.add(new User(3L, "user3", "user3"));
    }

    public List<User> index() {
        return userList;
    }

    public User show(int id) {
        return userList.stream().filter(user -> user.getId() == id).findAny().orElse(null);
    }
}
