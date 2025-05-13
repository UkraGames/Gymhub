package com.gymhub.model;
/**
 *
 * @author diego
 */
public class Payment {
    private int idPayment;
    private int paymentType;
    private float paymentAmount;
    
    //Constructors
    public Payment() {}
    
    public Payment(int idPayment, int paymentType, float paymentAmount) {
        this.idPayment = idPayment;
        this.paymentType = paymentType;
        this.paymentAmount = paymentAmount;
    }
    
    //Getters and Setters

    public int getIdPayment() {
        return idPayment;
    }

    public void setIdPayment(int idPayment) {
        this.idPayment = idPayment;
    }

    public int getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(int paymentType) {
        this.paymentType = paymentType;
    }

    public float getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(float paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    @Override
    public String toString(){
        String text = null;
        switch (paymentType){
            case 1: text ="1 - Efectivo";
            case 2: text ="2 - Transferencia";
        }
        return text;
    }
 
    
}
