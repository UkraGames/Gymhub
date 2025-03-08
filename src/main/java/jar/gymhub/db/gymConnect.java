package jar.gymhub.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class gymConnect {
    protected Connection conn;
    private String dataBaseURL = "jdbc:sqlite:";
    
    public gymConnect(String URL){
        dataBaseURL.concat(URL);
    }
    
    public void getConnection(){
        if (dataBaseURL != null){
            try {
                conn = DriverManager.getConnection(dataBaseURL);
                System.out.println("Conexión exitosa");
            } catch (SQLException e){
                System.out.println("Error al conectar" + e.getMessage());
            }
        }
    }
    
    public void closeConnection(){
        try{
            if (conn == null){
                return;
            }
            if (conn.isClosed()){
            }else{
                conn.close();
            }
        } catch (SQLException e){
            System.out.println("Error al conectar" + e.getMessage());
        }
    }
}
