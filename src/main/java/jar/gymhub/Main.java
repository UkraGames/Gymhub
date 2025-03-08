package jar.gymhub;
import jar.gymhub.db.gymConnect;

public class Main {

    public static void main(String[] args) {
        //Aquí va una nueva línea
       gymConnect con = new gymConnect("/home/Descargas/dataBase.db");
       
       con.getConnection();
        
    }
}
