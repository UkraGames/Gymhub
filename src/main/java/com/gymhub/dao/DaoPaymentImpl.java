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
import java.sql.ResultSet;
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
        try{
            PreparedStatement up = conn.prepareStatement("SELECT * FROM payment");
            ResultSet rs = up.executeQuery();
            while (rs.next()){
                Payment obj = new Payment();
                obj.setIdPayment(rs.getInt("idPayment"));
                obj.setPaymentType(rs.getByte("paymentType"));
                obj.setPaymentAmount(rs.getFloat("paymentAmount"));
                list.add(obj);
            }
        } catch (SQLException ex){
            ex.printStackTrace();
        }finally {
           this.closeConnection();
        }
        return list;
    }

    @Override
    public ArrayList<Payment> searchByPayment(int id) throws Exception {
        ArrayList<Payment> list = new ArrayList();
        try{
            PreparedStatement up = conn.prepareStatement("SELECT * FROM payment WHERE idPayment = ?");
            up.setInt(1, id);
            ResultSet rs = up.executeQuery();
            while (rs.next()){
                Payment obj = new Payment();
                obj.setIdPayment(rs.getInt("idPayment"));
                obj.setPaymentType(rs.getByte("paymentType"));
                obj.setPaymentAmount(rs.getFloat("paymentAmount"));
                list.add(obj);
            }
        } catch (SQLException ex){
            ex.printStackTrace();
        } finally {
            this.getConnection();
        }
        
        return list;
    }
    
}
