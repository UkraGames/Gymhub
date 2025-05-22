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
import com.gymhub.dao.DaoSubTypeImpl;
import com.gymhub.model.SubType;
import java.util.ArrayList;
public class SubTypeService {
    private final DaoSubType dao = new DaoSubTypeImpl();
    
    public SubTypeService (){
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
    
    public ArrayList<SubType> getAllSubType () throws Exception {
        return dao.listOfSubType();
    }
}
