package com.example.briefjee.DAO;

import com.example.briefjee.Entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

import javax.swing.text.html.parser.Entity;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class UserDAOImpl implements UserDAO{
    private EntityManager entityManager;
    public UserDAOImpl() {
        entityManager = Persistence.createEntityManagerFactory("First").createEntityManager();

    }

    @Override
    public void ajouter(User user) {
        entityManager.persist(user);

    }

    @Override
    public List<User> list() {
        return null;
    }
}
