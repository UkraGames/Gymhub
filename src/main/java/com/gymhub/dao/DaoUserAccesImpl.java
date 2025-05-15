package com.gymhub.dao;

import com.gymhub.model.UserAcces;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class DaoUserAccesImpl implements DaoUserAcces {
    private Connection conn;

    public DaoUserAccesImpl(Connection conn) {
        this.conn = conn;
    }
    
    @Override
    public void insertUser(UserAcces user) throws Exception {
        String sql = "INSERT INTO user_acces (id, nombre, password) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, user.getIdUser());
            stmt.setString(2, user.getUserName());
            stmt.setString(3, user.getPassword());
            stmt.executeUpdate();
        }
    }
}
