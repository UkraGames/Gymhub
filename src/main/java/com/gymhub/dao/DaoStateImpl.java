/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gymhub.dao;

import com.gymhub.db.GymConnect;
import com.gymhub.model.State;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class DaoStateImpl extends GymConnect implements DaoState {

    @Override
    public void uploadState(State e) throws Exception {
        try {
            this.getConnection();
            PreparedStatement up = conn.prepareStatement("INSER INTO State (descrption) VALUES (?)");
            up.setString( 1, e.getDescription());
            up.executeUpdate();
        } catch(SQLException ex){
            ex.printStackTrace();
        }finally{
            this.closeConnection();
        }
    }

    @Override
    public void modifyState(State e) throws Exception {
        try{
            this.getConnection();
            PreparedStatement up = conn.prepareStatement("UPDATE State SET description = ? WHERE idState = ?");
            up.setString(1, e.getDescription());
            up.setInt(2, e.getIdState());
            up.executeUpdate();
        } catch (SQLException ex){
            ex.printStackTrace();
        } finally{
            this.closeConnection();
        }
    }

    @Override
    public ArrayList<State> listOfState() throws Exception {
        ArrayList<State> list = new ArrayList<State>();
        try{
            this.getConnection();
            PreparedStatement up = conn.prepareStatement("SELECT * FROM  State");
            ResultSet rs = up.executeQuery();
            while(rs.next()){
                State obj = new State();
                obj.setIdState(rs.getByte("idState"));
                obj.setDescription(rs.getString("description"));
                list.add(obj);
            }
        } catch(SQLException ex){
            ex.printStackTrace();
        } finally{
            this.closeConnection();
        }
        return list;
    }

    @Override
    public ArrayList<State> searchByState(int id) throws Exception {
        ArrayList<State> list = new ArrayList<State>();
                try{
            this.getConnection();
            PreparedStatement up = conn.prepareStatement("SELECT * FROM  State WHERE idState = ?");
            up.setInt(1, id);
            ResultSet rs = up.executeQuery();
            while(rs.next()){
                State obj = new State();
                obj.setIdState(rs.getByte("idState"));
                obj.setDescription(rs.getString("description"));
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
