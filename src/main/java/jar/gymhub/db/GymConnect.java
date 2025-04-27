package jar.gymhub.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author diego
 */
public abstract class GymConnect {
    protected Connection conn;
    protected String dataBaseURL; 
    
    /**
     *
     */
    public void getConnection(){
        if (dataBaseURL != null){
            try {
                conn = DriverManager.getConnection(dataBaseURL);
                System.out.println("Connected");
            } catch (SQLException e){
                System.out.println("Error at connect" + e.getMessage());
            }
        } else {
            System.out.println("There's no path");
        }
    }
    
    public void setURL(String URL){
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
}
