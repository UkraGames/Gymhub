/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gymhub.dao;

import com.gymhub.db.GymConnect;
import com.gymhub.model.SubType;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class DaoSubTypeImpl extends GymConnect implements DaoSubType {

    @Override
    public void uploadSubType(SubType e) throws Exception {
        try{
            this.getConnection();
            PreparedStatement up = conn.prepareStatement("INSERT INTO subType (description) VALUES (?)");
            up.setString(1, e.getDescription());
            up.executeUpdate();
        } catch (SQLException ex ){
            ex.printStackTrace();
        } finally {
            this.closeConnection();
        }
    }

    @Override
    public void modifySubType(SubType e) throws Exception {
        try{
            this.getConnection();
            PreparedStatement up = conn.prepareStatement("UPDATE subType SET description = ? WHERE idSubType = ?");
            up.setString(1, e.getDescription());
            up.setInt(2, e.getIdSubType());
            up.executeUpdate();
        } catch(SQLException ex){
            ex.printStackTrace();
        } finally {
            this.closeConnection();
        }
    }

    @Override
    public void deleteSubType(SubType e) throws Exception {
        try{
            this.getConnection();
            PreparedStatement up = conn.prepareStatement("DELETE FROM subType WHERE idSubType = ?");
            up.setInt(1, e.getIdSubType());
            up.executeUpdate();
        } catch (SQLException ex){
            ex.printStackTrace();
        } finally {
            this.closeConnection();
        }
    }

    @Override
    public ArrayList<SubType> listOfSubType() throws Exception {
        ArrayList<SubType> list = new ArrayList();
        try{
            this.getConnection();
            PreparedStatement up = conn.prepareStatement("SELECT * FROM subType");
            ResultSet rs = up.executeQuery();
            while(rs.next()){
                SubType obj = new SubType();
                obj.setIdSubType(rs.getByte("idSubType"));
                obj.setDescription(rs.getString("description"));
                
                list.add(obj);
            }
        } catch (SQLException ex){
            ex.printStackTrace();
        } finally{
            this.closeConnection();
        }
        return list;
    }

    @Override
    public ArrayList<SubType> searchBySubType(int id) throws Exception {
                ArrayList<SubType> list = new ArrayList();
        try{
            this.getConnection();
            PreparedStatement up = conn.prepareStatement("SELECT * FROM subType WHERE idSubType = ?");
            up.setInt(1, id);
            ResultSet rs = up.executeQuery();
            while(rs.next()){
                SubType obj = new SubType();
                obj.setIdSubType(rs.getByte("idSubType"));
                obj.setDescription(rs.getString("description"));
                
                list.add(obj);
            }
        } catch (SQLException ex){
            ex.printStackTrace();
        } finally{
            this.closeConnection();
        }
        return list;
    }
    
}
