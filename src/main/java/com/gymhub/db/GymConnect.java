package com.gymhub.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author diego
 */

public abstract class GymConnect {
    protected Connection conn; //Variable de conexión
    protected String dataBaseURL; //Paso hacia la URL (La base de Datos)
    
    public GymConnect (){
        this.setURL(detectSystem());
    }
    /**
     *
     */
    public void getConnection(){
        if (dataBaseURL != null){
            try {
                conn = DriverManager.getConnection(dataBaseURL);
                System.out.println("Conexion exitosa");
                System.out.println("Connected");
            } catch (SQLException e){
                System.out.println("Error at connect" + e.getMessage());
            }
        } else {
            System.out.println("There's no path");
        }
    }
    
    protected final void setURL(String URL){
        this.dataBaseURL = "jdbc:sqlite:" + URL;
    }
    
    
    public void closeConnection(){
        try{
            if (conn == null || conn.isClosed()){
                return;
            }
            if (conn.isClosed()){
            }else{
                conn.close();
            }
        } catch (SQLException e){
            System.out.println("Error at connect" + e.getMessage());
        }
    }
    
    /**
     *
     * @return This is only for using with DataBase.java and be able to use it in here
     */
    protected String detectSystem(){
        String newPathOfSystem;
        var systemName = System.getProperty("os.name");
        systemName = systemName.toLowerCase();
        if (systemName.contains("windows")) {
            newPathOfSystem = System.getProperty("user.home") + "\\GymHubApp\\dataBase.db"; //Esto lo debe de probar Julián, ya no tengo windows actualmente
        } else if (systemName.contains("linux")) {
            newPathOfSystem = System.getProperty("user.home") + "/GymHubApp/dataBase.db"; //Actualmente funcionando
        } else if (systemName.contains("mac")) {
            newPathOfSystem = System.getProperty("user.home") + "/GymHubApp/dataBase.db"; //Dudo que vayamos a saber si funciona, no tenemos MacOS ninguno 
        } else {
            newPathOfSystem = System.getProperty("user.home") + "/GymHubApp/dataBae.db"; //¿Qué sería? ¿BSD? ¿Quién usa eso honestamente? XD
        }
        return newPathOfSystem;
    }
}
