/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gymhub.services;

/**
 *
 * @author diego
 */
import com.gymhub.dao.DaoSubType;
import com.gymhub.model.SubType;
public class SubTypeService {
    private DaoSubType dao;
    
    public SubTypeService (DaoSubType dao){
        this.dao = dao;
    }
    
    public void createSubType (SubType subType) throws Exception {
        dao.uploadSubType(subType);
    }
    
    public void modifyType(SubType subType) throws Exception {
        dao.modifySubType(subType);
    }
    
    public void deleteSubType (SubType subType) throws Exception {
        dao.deleteSubType(subType);
    }
    
    public void getAllSubType () throws Exception {
        dao.listOfSubType();
    }
}
