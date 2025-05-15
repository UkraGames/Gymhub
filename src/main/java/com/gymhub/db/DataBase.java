package com.gymhub.db;
/**
 * @author diego
 */
import java.io.*;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
    ESTA CLASE ESTÁ DESTINADA A ÚNICAMENTE SER USADA UNA VEZ AL INICIAR EL PROGRAMA, POR FAVOR TRATAR DE NO TOCAR O USARLA MÁS
*/
public class DataBase extends GymConnect {
    String path;
    public DataBase() { //Inicializa todo, crea el path apartir de la detección del sistema
        var newPath = detectSystem();
        setURL(newPath);
        this.path = newPath;
        createPath();
        createDataBase();
    }
    //Este método debería detectar qué tipo de sistema tiene el usuario. Iré marcando cuáles funcionan
    //Esta sentencia crea la base de datos, la base fue creada por Alejo, no sé si las relaciones estén bien pero tampoco importa (Tal vez) 
    //Si hay errores en la base, culpen a Alejandro XD || arreglado un poco el día 14/03/2025.
    private void createDataBase(){
        String sql = """
            CREATE TABLE IF NOT EXISTS paymentType (
                idPaymentType INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
                description TEXT
            );
            
            CREATE TABLE IF NOT EXISTS State (
                idState INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
                description TEXT
            );
            
            CREATE TABLE IF NOT EXISTS subType (
                idSubType INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
                description TEXT
            );
            
            CREATE TABLE IF NOT EXISTS payment (
                idPayment INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
                paymentType INTEGER,
                paymentAmount REAL CHECK (paymentAmount >= 0),
                FOREIGN KEY (paymentType) REFERENCES paymentType (idPaymentType) ON DELETE CASCADE
            );
            
            CREATE TABLE IF NOT EXISTS client (
                nameClient TEXT,
                documentClient INTEGER NOT NULL PRIMARY KEY CHECK (documentClient > 0),
                startDate TEXT,
                finalDate TEXT,
                subState INTEGER,
                subType INTEGER,
                number TEXT,
                eMail TEXT,
                height REAL CHECK (height > 0),
                weight REAL CHECK (weight > 0),
                payment INTEGER,
                FOREIGN KEY (subState) REFERENCES State (idState) ON DELETE CASCADE,
                FOREIGN KEY (payment) REFERENCES payment (idPayment) ON DELETE CASCADE,
                FOREIGN KEY (subType) REFERENCES subType (idSubType) ON DELETE CASCADE
            );
            
            CREATE TABLE IF NOT EXISTS userAcces (
                idUser INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
                userName TEXT,
                password TEXT
            );
        """;
        this.getConnection();
        try {
            Statement st = conn.createStatement();
            st.executeUpdate(sql);
        } catch (SQLException e){
            System.err.print(e.getCause() + " " + e.getErrorCode());
        }
        this.closeConnection();
    }
    //Este método debería crear el archivo y el path (la cadena de directorios en case de ser necesario)
    
    private void createPath() {    
        File file = new File(path); //crea un objeto tipo File y se le indica el camino o ruta
        File parentDir = file.getParentFile();//Detecta si existe el directorio
    
        if (parentDir != null || !parentDir.exists()) {
            parentDir.mkdirs(); // Crea los directorios necesarios si no existen
        }

        if (!file.exists()) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
                    //Crea el archivo primero que nada
            } catch (IOException ex) {
                Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }   

}
