/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gymhub.services;

import com.gymhub.dao.DaoUserAccesImpl;
import com.gymhub.model.UserAcces;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
/**
 *
 * @author diego
 */
public class AdminService {
    private final DaoUserAccesImpl userDao = new DaoUserAccesImpl();

    public AdminService(){
        
    }

    public void insertToUser(UserAcces user) throws Exception{

        if (user.getUserName() == null || user.getUserName().isEmpty()){
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        if (user.getPassword() == null || user.getPassword().isEmpty() || user.getPassword().isBlank()){
            throw new IllegalArgumentException("la contraseña no puede estar vacío.");
        }
        userDao.insertUser(user);

    }
    
    public ArrayList<UserAcces> getAdmin() throws Exception {
       ArrayList<UserAcces> list = this.userDao.listAllUsers();
        if (!list.isEmpty()){
            return list;
        }
    }
    
}