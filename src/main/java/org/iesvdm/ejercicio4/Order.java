package org.iesvdm.ejercicio4;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Order {
    private String number_id;
    private LocalDate ordered;
    private LocalDate shipped;
    private Address ship_to;
    private List<Payment> paymentList = new ArrayList<>();

    public List<Payment> getPaymentList() {
        return paymentList;
    }

    public void setPaymentList(List<Payment> paymentList) {
        this.paymentList = paymentList;
    }

    private enum status {NEW, SHIPPED,HOLD, DELIVERED,CLOSED};
    private BigDecimal total;

    private List<LineItem> lineItemList;

    public List<LineItem> getLineItemList() {
        return lineItemList;
    }

    public void setLineItemList(List<LineItem> lineItemList) {
        this.lineItemList = lineItemList;
    }

    public Order(String number_id, LocalDate ordered, LocalDate shipped, Address ship_to, BigDecimal total) {
        this.number_id = number_id;
        this.ordered = ordered;
        this.shipped = shipped;
        this.ship_to = ship_to;
        this.total = total;
        BigDecimal precio = new BigDecimal(300);

    }

    public String getNumber_id() {
        return number_id;
    }

    public void setNumber_id(String number_id) {
        this.number_id = number_id;
    }

    public LocalDate getOrdered() {
        return ordered;
    }

    public void setOrdered(LocalDate ordered) {
        this.ordered = ordered;
    }

    public LocalDate getShipped() {
        return shipped;
    }

    public void setShipped(LocalDate shipped) {
        this.shipped = shipped;
    }

    public Address getShip_to() {
        return ship_to;
    }

    public void setShip_to(Address ship_to) {
        this.ship_to = ship_to;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}
