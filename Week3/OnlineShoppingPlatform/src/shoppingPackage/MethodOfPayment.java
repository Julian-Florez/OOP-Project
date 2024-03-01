package shoppingPackage;
/**
 * This class represents a method of payment in the shop.
 * It contains the type, number, expiration date and cvv of the payment method.
 * It also contains the customer that owns the payment method.
 */
public class MethodOfPayment{
    private Customer customer;
    private String type;
    private String number;
    private String expirationDate;
    private String cvv;

    /**
     * Constructor for the MethodOfPayment class.
     * @param customer
     * @param type
     * @param number
     * @param expirationDate
     * @param cvv
     */
    public MethodOfPayment(Customer customer, String type, String number, String expirationDate, String cvv) {
        this.customer = customer;
        this.type = type;
        this.number = number;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getType() {
        return type;
    }

    public String getNumber() {
        return number;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public String getCvv() {
        return cvv;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
    
    /**
     * This method returns a string representation of the MethodOfPayment class.
     */
    public String toString() {
        return "(Type: " + this.type + " Number: " + this.number + " Expiration Date: " + this.expirationDate + " CVV: " + this.cvv + ")";
    }
}