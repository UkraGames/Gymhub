package jar.gymhub.db;
/**
 * @author diego
 */
import java.io.*;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
public class dataBase extends gymConnect {
    String path;
    public dataBase(String URL) {
        this.setURL(URL);
        this.path = URL;
    }
   
    public void createDataBase(){
        String sql = """
            CREATE TABLE IF NOT EXISTS paymentType (
                idPaymentType INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
                description VARCHAR(500)
            );

            CREATE TABLE IF NOT EXISTS State (
                idState INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
                description VARCHAR(500)
            );

            CREATE TABLE IF NOT EXISTS subType (
                idSubType INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
                description VARCHAR(500)
            );

            CREATE TABLE IF NOT EXISTS payment (
                idPayment INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
                paymentType INTEGER,
                paymentAmount FLOAT,
                FOREIGN KEY (paymentType) REFERENCES paymentType (idPaymentType)
            );

            CREATE TABLE IF NOT EXISTS client (
                nameClient VARCHAR(500),
                documentClient INTEGER NOT NULL PRIMARY KEY,
                startDate VARCHAR(500),
                finalDate VARCHAR(500),
                subState INTEGER,
                subType INTEGER,
                number VARCHAR(500),
                eMail VARCHAR(500),
                height FLOAT,
                weight FLOAT,
                payment INTEGER,
                FOREIGN KEY (subState) REFERENCES State (idState),
                FOREIGN KEY (payment) REFERENCES payment (idPayment),
                FOREIGN KEY (subType) REFERENCES subType (idSubType)
            );

            CREATE TABLE IF NOT EXISTS userAcces (
                idUser INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
                userName VARCHAR(500),
                password VARCHAR(500)
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
    public void createPath() {    
        File file = new File(path);
        File parentDir = file.getParentFile();
    
        if (parentDir != null || !parentDir.exists()) {
            parentDir.mkdirs(); // Crea los directorios necesarios si no existen
        }

        if (!file.exists()) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
                    
            } catch (IOException ex) {
                Logger.getLogger(dataBase.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }   

}
