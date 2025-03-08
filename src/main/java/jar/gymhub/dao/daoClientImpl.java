package jar.gymhub.dao;
/**
 *
 * @author diego
 */
import jar.gymhub.classes.client;
import jar.gymhub.db.gymConnect;
import jar.gymhub.faces.daoClient;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
public class daoClientImpl extends gymConnect implements daoClient {
    
    @Override
    public void uploadClient(client e) throws Exception {
        try {
            PreparedStatement up = conn.prepareStatement("INSERT INTO client (nameClient, documentClient, startDate, finalDate, subState, subType, number, eMail, height, weight, payment) VALUES  (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            up.setString(1, e.getNameClient());
            up.get
        } catch (SQLException ex){
            System.out.println(ex.getCause());
        } finally{
        
        }
    }

    @Override
    public void modifyClient(client e) throws Exception {
        
    }

    @Override
    public ArrayList<client> listOfClient() throws Exception {
        ArrayList<client> list = new ArrayList();
        return list;
    }

    @Override
    public ArrayList<client> searchByClient() throws Exception {
        ArrayList<client> list = new ArrayList();
        return list;
    }
    
    
}
