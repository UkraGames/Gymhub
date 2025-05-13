/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gymhub.dao;

/**
 *
 * @author diego
 */
import com.gymhub.db.GymConnect;
import com.gymhub.model.Payment;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
public class DaoPaymentImpl extends GymConnect implements DaoPayment {
    public DaoPaymentImpl(){
        this.setURL(this.detectSystem());
    }
    @Override
    public void uploadPayment(Payment e) throws Exception {
        this.setURL(this.detectSystem());
        try {
            this.getConnection();
            PreparedStatement up = conn.prepareStatement("INSERT INTO payment (paymentType, paymentAmount) VALUES (?, ?)");
            up.setInt(1, e.getPaymentType());
            up.setFloat(2, e.getIdPayment());
            up.executeUpdate();
        } catch (SQLException ex){
            ex.printStackTrace();
        } finally {
            this.closeConnection();
        }
    }
    @Override
    public void modifyPayment(Payment e) throws Exception {
       try{
           this.getConnection();
           PreparedStatement up = conn.prepareStatement("UPDATE payment SET paymentType = ?,  paymentAmount = ? WHERE idPayment = ?");
           up.setInt(1, e.getPaymentType());{
           up.setFloat(2, e.getPaymentAmount());
           up.setInt(3, e.getIdPayment());
       }
       } catch(SQLException ex){
           ex.printStackTrace();
       }  finally{
           this.closeConnection();
       }
    }

    @Override
    public void deletePayment(Payment e) throws Exception {
       try{
           this.getConnection();
           PreparedStatement up = conn.prepareStatement("DELETE FROM payment WHERE idPayment = ?");
           up.setInt(1, e.getIdPayment());
           up.executeUpdate();
       } catch(SQLException ex){
           ex.printStackTrace();
       } finally{
           
       }
    }

    @Override
    public ArrayList<Payment> listOfPayment() throws Exception {
        ArrayList<Payment> list = new ArrayList();
        return list;
    }

    @Override
    public ArrayList<Payment> searchByPayment(String name) throws Exception {
        ArrayList<Payment> list = new ArrayList();
        return list;
    }
    
}
