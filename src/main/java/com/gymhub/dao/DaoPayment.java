package com.gymhub.dao;
/**
 *
 * @author diego
 */
import com.gymhub.model.Payment;
import java.util.ArrayList;
public interface DaoPayment {
    public void uploadPayment (Payment e) throws Exception;
    public void modifyPayment (Payment e) throws Exception;
    public void deletePayment (Payment e) throws Exception;
    public ArrayList<Payment> listOfPayment () throws Exception;
    public ArrayList<Payment> searchByPayment (int id) throws Exception;
}
