package model;
import java.util.ArrayList;

public class MethodOfPayment{
    private Customer customer;
    private String type;
    private String number;
    private String expirationDate;
    private String cvv;

    public MethodOfPayment addMethodOfPayment(Customer customer, String type, String number, String expirationDate, String cvv) {
        this.customer = customer;
        this.type = type;
        this.number = number;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
        return this;
    }

    public void updateMethodOfPayment(String type, String number, String expirationDate, String cvv) {
        this.type = type;
        this.number = number;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }
}