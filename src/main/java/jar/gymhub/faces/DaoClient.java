package jar.gymhub.faces;
/**
 *
 * @author diego
 */
import jar.gymhub.classes.Client;
import java.util.ArrayList;
public interface DaoClient {
    public void uploadClient (String URL, Client e) throws Exception;
    public void modifyClient (Client e) throws Exception;
    public void deleteClient (Client e) throws Exception;
    public ArrayList<Client> listOfClient () throws Exception;
    public ArrayList<Client> searchByClient (String name) throws Exception;
}
