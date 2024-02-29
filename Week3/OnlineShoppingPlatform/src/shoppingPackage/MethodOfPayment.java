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

    public void updateMethodOfPayment(String type, String number, String expirationDate, String cvv) {
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
}