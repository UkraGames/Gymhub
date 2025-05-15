/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gymhub.Services;

/**
 *
 * @author diego
 */
import com.gymhub.dao.DaoPaymentType;
import com.gymhub.model.PaymentType;
public class PaymentTypeService {
    private DaoPaymentType dao;
    public PaymentTypeService(DaoPaymentType dao){
        this.dao = dao;
        
    }
    
    public void createATypeOfPayment(PaymentType payment) throws Exception {
        dao.uploadPaymentType(payment);

    }

    public void modifyTypeOfPyment(PaymentType payment) throws Exception{
        dao.modifyPaymentType(payment);
    }
    
    public void deleteTypeOfPayment()

}

