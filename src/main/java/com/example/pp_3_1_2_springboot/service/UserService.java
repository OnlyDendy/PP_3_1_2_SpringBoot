package com.example.pp_3_1_2_springboot.service;



import com.example.pp_3_1_2_springboot.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUser(int id);
    void addUser(User user);
    void update(User updatedUser);
    void delete(int id);
}