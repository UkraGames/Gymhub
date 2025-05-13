package com.gymhub.dao;
/**
 *
 * @author diego
 */
import com.gymhub.model.Client;
import com.gymhub.db.GymConnect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.gymhub.dao.DaoClient;

public class DaoClientImpl extends GymConnect implements DaoClient {
    public DaoClientImpl(){
        this.setURL(this.detectSystem());
    }
    @Override
    public void uploadClient(Client e) {
        
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
    public void modifyClient(Client e) throws Exception {
        try {
            this.getConnection();
            String sql = "UPDATE client (nameClient, documentClient, startDate, finalDate, subState, subType, number, eMail, height, weight, payment) VALUES  (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?))";
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
        }catch(SQLException ex){
            ex.printStackTrace();
        } finally {
            this.closeConnection();
        }
        
    }

    @Override
    public ArrayList<Client> listOfClient() throws Exception {
        ArrayList<Client> listOfClients = new ArrayList();
        
        try{
            this.getConnection();
            PreparedStatement up = conn.prepareStatement("SELECT * FROM client");
            ResultSet rs = up.executeQuery();
            while(rs.next()){
                Client client = new Client();
                client.setNameClient(rs.getString("nameClient"));
                client.setDocumentClient(rs.getInt("documentClient"));
                client.setStartDate(rs.getString("startDate"));
                client.setFinalDate(rs.getString("finalDate"));
                client.setSubState(rs.getByte("subState"));
                client.setSubType(rs.getByte("subType"));
                client.setNumber(rs.getString("number"));
                client.seteMail(rs.getString("eMail"));
                client.setHeitght(rs.getFloat("height"));
                client.setWeight(rs.getFloat("weight"));
                client.setPayment(rs.getInt("payment"));
                listOfClients.add(client);
                
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally{
            this.closeConnection();
        }
        return listOfClients;
    }

    @Override
    public ArrayList<Client> searchByClient(String Name) throws Exception {
        ArrayList<Client> listForSearch = new ArrayList();
        try {
            this.getConnection();
            PreparedStatement up = conn.prepareStatement("SELECT * FROM client Where nameClient = ?");
            up.setString(1, Name);
            ResultSet rs = up.executeQuery();
            while (rs.next()){
                Client client = new Client();
                client.setNameClient(rs.getString("nameClient"));
                client.setDocumentClient(rs.getInt("documentClient"));
                client.setStartDate(rs.getString("startDate"));
                client.setFinalDate(rs.getString("finalDate"));
                client.setSubState(rs.getByte("subState"));
                client.setSubType(rs.getByte("subType"));
                client.setNumber(rs.getString("number"));
                client.seteMail(rs.getString("eMail"));
                client.setHeitght(rs.getFloat("height"));
                client.setWeight(rs.getFloat("weight"));
                client.setPayment(rs.getInt("payment"));
                listForSearch.add(client);
            }
        } catch(SQLException ex){
            ex.printStackTrace();
        }finally{
            
        }
        return listForSearch;
    }

    @Override
    public void deleteClient(Client e) throws Exception {
        try {
            this.getConnection();
            PreparedStatement up = conn.prepareStatement("DELETE FROM client WHERE documentClient = ?");
            up.setInt(1, e.getDocumentClient());
            up.executeUpdate();
        } catch (SQLException ex){
            this.closeConnection();
        }
        
    }

    
    
}
