package jar.gymhub.classes;
//IT WAS MADE BY ME DIEGO, ONCE MORE MUAJAJAJAJAJA
public class paymentType {
    private int idPaymentType;
    private String description; //LOL I wrote "Stirng" at first
    
    //Constructors 

    public paymentType() {}

    public paymentType(int idPaymentType, String description) {
        this.idPaymentType = idPaymentType;
        this.description = description;
    }
    
    //Getters and setters

    public int getIdPaymentType() {
        return idPaymentType;
    }

    public void setIdPaymentType(int idPaymentType) {
        this.idPaymentType = idPaymentType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
