package jar.gymhub;
import jar.gymhub.db.gymConnect;

public class Main {

    public static void main(String[] args) {
        //Aquí va una nueva línea
       gymConnect con = new gymConnect("C:\\Users\\DELL\\Downloads\\VM\\Nueva carpeta\\hola.db");
       
       var system = System.getProperty("os.name");
       System.out.println(system);
       
       
       con.getConnection();
       //holamundo
    }
}
