/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gymhub.services;

import com.gymhub.dao.DaoPayment;
import com.gymhub.dao.DaoPaymentImpl;
import com.gymhub.model.Payment;
import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class PaymentService {
    private final DaoPayment dao = new DaoPaymentImpl();
    
    public PaymentService(){
        
    }
    
    public void inserPayment(Payment pay) throws Exception {
        dao.uploadPayment(pay);
    }
    
    public void modifyPayment(Payment pay) throws Exception {
        dao.modifyPayment(pay);
    }
    
    public void deletePayment(Payment pay) throws Exception {
        dao.deletePayment(pay);
    }
    
    public ArrayList<Payment> getAllPayments() throws Exception {
       return dao.listOfPayment();
    }
}
