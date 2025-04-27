package jar.gymhub.faces;
/**
 *
 * @author diego
 */
import jar.gymhub.classes.PaymentType;
import java.util.ArrayList;
public interface DaoPaymentType {
    public void uploadPaymentType(PaymentType e) throws Exception;
    public void modifyPaymentType (PaymentType e) throws Exception;
    public void deletePaymentType (PaymentType e) throws Exception;
    public ArrayList<PaymentType> listOfPaymentType() throws Exception;
    public ArrayList<PaymentType> searchByPaymentType(String name) throws Exception;
    
}
