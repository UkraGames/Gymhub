/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gymhub.Services;

import com.gymhub.dao.DaoUserAcces;
import com.gymhub.model.UserAcces;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author diego
 */
public class AdminService {
    private DaoUserAcces userDao;

    public AdminService(DaoUserAcces userDao){
        this.userDao = userDao;
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
}