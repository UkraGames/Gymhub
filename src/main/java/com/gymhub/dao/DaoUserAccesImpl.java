package com.gymhub.dao;

import com.gymhub.db.GymConnect;
import com.gymhub.model.UserAcces;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DaoUserAccesImpl extends GymConnect implements DaoUserAcces {
    
    @Override
    public void insertUser(UserAcces user) throws Exception {
        String sql = "INSERT INTO userAcces (idUser nombre, password) VALUES (?, ?, ?)";
        this.getConnection();
        
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, user.getIdUser());
            stmt.setString(2, user.getUserName());
            stmt.setString(3, user.getPassword());
            stmt.executeUpdate();
        }catch (SQLException ex){
            ex.printStackTrace();
        } finally {
            this.closeConnection();
        }
    }

    @Override
    public ArrayList listAllUsers() throws Exception {
        ArrayList list = new ArrayList();
        try{
            this.getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM userAcces");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()){
                UserAcces obj = new UserAcces();
                obj.setIdUser(rs.getByte("idUser"));
                obj.setPassword(rs.getString("password"));
                obj.setUserName(rs.getString("userName"));
                list.add(obj);
            }
        } catch(SQLException ex){
            ex.printStackTrace();
        } finally{
            this.closeConnection();
        }
        return list;
    }
}
