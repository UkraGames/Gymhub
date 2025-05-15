/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gymhub.Services;

import com.gymhub.dao.DaoStateImpl;
import com.gymhub.model.State;

/**
 *
 * @author diego
 */
public class StateService {
    private DaoStateImpl dao;
    
    public StateService(DaoStateImpl dao){
        this.dao = dao; 
    }
    
    
    public void createState(State state){
        dao.uploadState(state);
    }
    
    public 
}
