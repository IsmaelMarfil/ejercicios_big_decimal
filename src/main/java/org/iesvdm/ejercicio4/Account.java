package org.iesvdm.ejercicio4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Account {
    private String id;
    private Address billing_Address;
    boolean isClosed;
    private Date open;

    private Date closed;

    private ShoppingCart shoppingCart;

    private List<Payment> paymentList = new ArrayList<>();

    private Customer customer;

    public Account(String id, Address billing_Address, boolean isClosed, LocalDate open) {
        this.id = id;
        this.billing_Address = billing_Address;
        this.isClosed = isClosed;
        this.open = open;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Address getBilling_Address() {
        return billing_Address;
    }

    public void setBilling_Address(Address billing_Address) {
        this.billing_Address = billing_Address;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed(boolean closed) {
        isClosed = closed;
    }

    public Date getOpen() {
        return open;
    }

    public void setOpen(Date open) {
        this.open = open;
    }

    public Date getClosed() {
        return closed;
    }

    public void setClosed(Date closed) {
        this.closed = closed;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public List<Payment> getPaymentList() {
        return paymentList;
    }

    public void setPaymentList(List<Payment> paymentList) {
        this.paymentList = paymentList;
    }
}
