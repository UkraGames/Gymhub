package com.gymhub.dao;
/**
 *
 * @author diego
 */
import com.gymhub.model.Client;
import java.util.ArrayList;
public interface DaoClient {
    public void uploadClient (Client e) throws Exception;
    public void modifyClient (Client e) throws Exception;
    public void deleteClient (Client e) throws Exception;
    public ArrayList<Client> listOfClient () throws Exception;
    public ArrayList<Client> searchByClient (String name) throws Exception;
}
