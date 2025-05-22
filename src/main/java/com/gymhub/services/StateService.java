/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gymhub.services;

import com.gymhub.dao.DaoStateImpl;
import com.gymhub.model.State;
import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class StateService {
    private final DaoStateImpl dao = new DaoStateImpl();
    
    public StateService(){
    }
    public void createState(State state) throws Exception {
        dao.uploadState(state);
    }
    
    public void modifyState(State state) throws Exception{
        dao.modifyState(state);
    }
    
    public ArrayList<State> getAllStates() throws Exception {
        return dao.listOfState();
    }
            
}
