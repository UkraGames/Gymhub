package jar.gymhub.dao;
/**
 *
 * @author diego
 */
import jar.gymhub.classes.client;
import java.util.ArrayList;
public interface daoClient {
    public void uploadClient (client e) throws Exception;
    public void modifyClient (client e) throws Exception;
    public ArrayList<client> listOfClient () throws Exception;
    public ArrayList<client> searchByClient () throws Exception;
}
