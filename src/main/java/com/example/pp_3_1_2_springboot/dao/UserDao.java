package com.example.pp_3_1_2_springboot.dao;
import com.example.pp_3_1_2_springboot.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    User getUser(int id);
    void addUser(User user);
    void update(User updatedUser);
    void delete(int id);
}