/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gymhub.Services;
import com.gymhub.dao.DaoClient;
import com.gymhub.model.Client;
import java.util.ArrayList;
/**
 *
 * @author diego
 */
public class ClientService {
    private final DaoClient cli;
    
    public ClientService(DaoClient client){
        this.cli = client;
    }
    
    public void insertClient(Client client) throws Exception {
        cli.uploadClient(client);
    }
    
    public void modifyClient(Client client) throws Exception {
        cli.modifyClient(client);
    }
    
    public ArrayList<Client> getAllClients(Client client) throws Exception {
        return cli.listOfClient();
    }
    
    public ArrayList<Client> searchClient(String Name) throws Exception {
        return cli.searchByClient(Name);
    }
    public void deleteClient(int id) throws Exception {
        cli.deleteClient(id);
    }
}
