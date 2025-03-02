package jar.gymhub.classes;
/**
 *
 * @author diego
 */
public class payment {
    private int idPayment;
    private int paymentType;
    private float paymentAmount;
    
    //Constructors
    public payment() {}
    
    public payment(int idPayment, int paymentType, float paymentAmount) {
        this.idPayment = idPayment;
        this.paymentType = paymentType;
        this.paymentAmount = paymentAmount;
    }

    
    //Getters and Setters

    public int getIdPayment() {
        return idPayment;
    }

    public void setIdPayment(int idPayment) {
        this.idPayment = idPayment;
    }

    public int getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(int paymentType) {
        this.paymentType = paymentType;
    }

    public float getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(float paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    
    
    
}
