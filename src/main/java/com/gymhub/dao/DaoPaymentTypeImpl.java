/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gymhub.dao;

import com.gymhub.db.GymConnect;
import com.gymhub.model.PaymentType;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class DaoPaymentTypeImpl extends GymConnect implements DaoPaymentType{

    @Override
    public void uploadPaymentType(PaymentType e) throws Exception {
        try {
            this.getConnection();
            PreparedStatement up = conn.prepareStatement("INSERT INTO paymentType (description) VALUES (?)");
            up.setString(1, e.getDescription());
            up.executeUpdate();
        } catch (SQLException ex){
            ex.printStackTrace();
        } finally{
            this.closeConnection();
        }
    }

    @Override
    public void modifyPaymentType(PaymentType e) throws Exception {
        try{
            this.getConnection();
            PreparedStatement up = conn.prepareStatement("UPDATE paymentType SET description = ? WHERE idPaymentType = ?");
            up.setString(1, e.getDescription());
            up.setInt(2, e.getIdPaymentType());
            up.executeUpdate();
        } catch (SQLException ex){
            ex.printStackTrace();
        } finally {
            this.closeConnection();
        }
    }

    @Override
    public void deletePaymentType(PaymentType e) throws Exception {
        try {
            this.getConnection();
            PreparedStatement up = conn.prepareStatement("DELETE FROM paymentType WHERE idPaymentType = ?");
            up.setInt(1, e.getIdPaymentType());
            up.executeUpdate();
        } catch(SQLException ex){
            ex.printStackTrace();
        } finally{
            this.closeConnection();
        }
        
    }

    @Override
    public ArrayList<PaymentType> listOfPaymentType() throws Exception {
        ArrayList<PaymentType> list = new ArrayList<PaymentType>();
        try {
            this.getConnection();
            PreparedStatement up = conn.prepareStatement("SELECT * FROM paymentType");
            ResultSet rs = up.executeQuery();
            while (rs.next()){
                PaymentType obj = new PaymentType();
                obj.setIdPaymentType(rs.getByte("idPaymentType"));
                obj.setDescription(rs.getString("description"));
                list.add(obj);
            }
        } catch (SQLException ex){
            ex.printStackTrace();
        } finally {
            this.closeConnection();
        }
        return list;
    }

    @Override
    public ArrayList<PaymentType> searchByPaymentType(int id) throws Exception {
        ArrayList<PaymentType> list = new ArrayList<PaymentType>();
        try {
            this.getConnection();
            PreparedStatement up = conn.prepareStatement("SELECT * FROM paymentType WHERE idPaymentType = ?");
            up.setInt(1, id);
            ResultSet rs = up.executeQuery();
            while (rs.next()){
                PaymentType obj = new PaymentType();
                obj.setIdPaymentType(rs.getByte("idPaymentType"));
                obj.setDescription(rs.getString("description"));
                list.add(obj);
            }
        } catch (SQLException ex){
            ex.printStackTrace();
        } finally {
            
        }
        return list;
    }
    
}
