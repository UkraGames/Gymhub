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
    public void uploadClient(String URL, client e) {
        setURL(URL);
        try {
            this.getConnection();
            String sql = "INSERT INTO client (nameClient, documentClient, startDate, finalDate, subState, subType, number, eMail, height, weight, payment) VALUES  (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement up = conn.prepareStatement(sql);
            up.setString(1, e.getNameClient());
            up.setInt(2, e.getDocumentClient());
            up.setString(3, e.getStartDate());
            up.setString(4, e.getFinalDate());
            up.setInt(5, e.getSubState());
            up.setInt(6, e.getSubType());
            up.setString(7, e.getNumber());
            up.setString(8, e.geteMail());
            up.setFloat(9, e.getHeight());
            up.setFloat(10, e.getWeight());
            up.setInt(11, e.getPayment());
            
            up.executeUpdate();
        } catch (SQLException ex){
            ex.printStackTrace();
        } finally{
            this.closeConnection();
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
    public ArrayList<client> searchByClient(String Name) throws Exception {
        ArrayList<client> list = new ArrayList();
        return list;
    }
    
    
}
