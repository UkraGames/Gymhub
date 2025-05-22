/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gymhub.services;

import java.awt.Component;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

/**
 *
 * @author diego
 */
public class SudoService {
    private final AdminService service = new AdminService();
    private boolean IsUser;
    private String password;
    public SudoService(Component e){
        try {
            JPasswordField passwordField = new JPasswordField();

        
            int opcion = JOptionPane.showConfirmDialog(
                null,
                passwordField,
                "Ingresa tu contraseña",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE
            );

            if (opcion == JOptionPane.OK_OPTION) {
                this.password = new String(passwordField.getPassword());
            } 
            var list = service.getAdmin();
            if (!list.get(0).getPassword().equals(this.password)){
                JOptionPane.showMessageDialog(e, "¡Contraseña incorrecto!", "Incorrecto", JOptionPane.ERROR_MESSAGE);
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
