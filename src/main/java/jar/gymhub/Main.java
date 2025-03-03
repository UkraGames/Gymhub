package jar.gymhub;

import java.sql.Connection;

public class Main {
    public class connection{
        Connection con= null;
        try{
            String url = "jdbc:sqlite:contactos.db";
            con = DriverManager.getConnection(url);
        }
        catch(SQLException e){
            System.out.println("Error:" + e.getMessage());
        }
    }
    public static void main(String[] args) {
        System.out.print("hola");
    }
}