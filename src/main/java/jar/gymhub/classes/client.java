package jar.gymhub.classes;
import java.util.Date;
/**
 *
 * @author diego - Only me can modify this, pls don't touch anything
 */
public class client { //Client class
    private String nameClient;
    private int documentClient;
    private String startDate;
    private String finalDate;
    private int subState; // "sub" is for Subscription
    private int subType; //"sub" again for subscription
    private String number;
    private String eMail;
    private float height;
    private float weight;
    private int payment;
        
    //Constructors
    public client (){} //void constructor

    public client(String nameClient, int documentClient, String startDate, String finalDate, int subState, int subType, String number, String eMail, float height,float weight, int payment) {
        this.nameClient = nameClient;
        this.documentClient = documentClient;
        this.startDate = startDate;
        this.finalDate = finalDate;
        this.subState = subState;
        this.subType = subType;
        this.number = number;
        this.eMail = eMail;
        this.height = height;
        this.weight = weight;
        this.payment = payment;
    }
        
    //Getters & Setters

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public int getDocumentClient() {
        return documentClient;
    }

    public void setDocumentClient(int documentClient) {
        this.documentClient = documentClient;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(String finalDate) {
        this.finalDate = finalDate;
    }

    public int getSubState() {
        return subState;
    }

    public void setSubState(int subState) {
        this.subState = subState;
    }

    public int getSubType() {
        return subType;
    }

    public void setSubType(int subType) {
        this.subType = subType;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public float getHeight() {
        return height;
    }

    public void setHeitght(float height) {
        this.height = height;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
    
        
}
