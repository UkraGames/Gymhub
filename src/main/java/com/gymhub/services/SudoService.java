/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gymhub.services;

import java.awt.Component;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class SudoService {
    private final AdminService service = new AdminService();
    private boolean IsUser;
    
    public SudoService(Component e){
        try {
            String suguesstedName = JOptionPane.showInputDialog("Inserte la contraseña del usuario");
            
            var list = service.getAdmin();
            if (!list.get(0).getUserName().equals(suguesstedName)){
                JOptionPane.showMessageDialog(e, "¡Usuario incorrecto!", "Usuario Incorrecto", JOptionPane.ERROR_MESSAGE);
                this.IsUser = false;
            } else {
                JOptionPane.showMessageDialog(e, "Usuario Confirmado", "Hecho", JOptionPane.INFORMATION_MESSAGE);
                this.IsUser = true;
            }
        } catch (Exception ex) {
            Logger.getLogger(SudoService.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
    
    public boolean getIsUser(){
        return IsUser;
    }
    
}
