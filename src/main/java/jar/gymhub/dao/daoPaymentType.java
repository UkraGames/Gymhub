package jar.gymhub.dao;
/**
 *
 * @author diego
 */
import jar.gymhub.classes.paymentType;
import java.util.ArrayList;
public interface daoPaymentType {
    public void uploadPaymentType(paymentType e) throws Exception;
    public void modifyPaymentType (paymentType e) throws Exception;
    public ArrayList<paymentType> listOfPaymentType() throws Exception;
    public ArrayList<paymentType> searchByPaymentType() throws Exception;
    
}
