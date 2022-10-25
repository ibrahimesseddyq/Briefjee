package com.example.briefjee.DAO;

import com.example.briefjee.Entity.User;

import java.util.List;

public interface UserDAO {
    void ajouter(User user);
    List<User> list();
}
