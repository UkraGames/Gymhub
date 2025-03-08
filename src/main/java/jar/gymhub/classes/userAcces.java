package jar.gymhub.classes;
/**
 *
 * @author diego
 */
public class userAcces {
    private int idUser; //Wait wdym with ID? it's only one Admin!
    private String userName;
    private String password;
    
    //Constructors

    public userAcces() {} //idk if it matters, but I hate when this shit occupes two lines

    public userAcces(int idUser, String userName, String password) {
        this.idUser = idUser;
        this.userName = userName;
        this.password = password;
    }
    
    //Getters & Setters

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
