package jar.gymhub.faces;
/**
 *
 * @author diego
 */
import jar.gymhub.classes.payment;
import java.util.ArrayList;
public interface daoPayment {
    public void uploadPayment (payment e) throws Exception;
    public void modifyPayment (payment e) throws Exception;
    public ArrayList<payment> listOfPayment () throws Exception;
    public ArrayList<payment> searchByPayment () throws Exception;
}
