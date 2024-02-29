package shoppingPackage;

public class MethodOfPayment{
    private Customer customer;
    private String type;
    private String number;
    private String expirationDate;
    private String cvv;

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

    public String toString() {
        return "(Type: " + this.type + " Number: " + this.number + " Expiration Date: " + this.expirationDate + " CVV: " + this.cvv + ")";
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
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


}