/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gymhub.services;

/**
 *
 * @author diego
 */
import com.gymhub.dao.DaoPaymentType;
import com.gymhub.model.PaymentType;
import java.util.ArrayList;
public class PaymentTypeService {
    private final DaoPaymentType dao;
    public PaymentTypeService(DaoPaymentType dao){
        this.dao = dao;
        
    }
    
    public void createATypeOfPayment(PaymentType payment) throws Exception {
        dao.uploadPaymentType(payment);

    }

    public void modifyTypeOfPyment(PaymentType payment) throws Exception{
        dao.modifyPaymentType(payment);
    }
    
    public void deleteTypeOfPayment(PaymentType payment) throws Exception{
        dao.deletePaymentType(payment);
       
    }
    
    public ArrayList<PaymentType> getAllPaymentType() throws Exception {
        return dao.listOfPaymentType();
    }
    
    public ArrayList<PaymentType> searchPaymentType(int id) throws Exception {
        return dao.searchByPaymentType(id);
    }

}

