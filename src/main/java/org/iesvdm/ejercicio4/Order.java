package org.iesvdm.ejercicio4;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Order {
    private String number_id;
    private Date ordered;
    private Date shipped;
    private Address ship_to;
    private List<Payment> paymentList = new ArrayList<>();

    private enum status {NEW, SHIPPED,HOLD, DELIVERED,CLOSED};
    private BigDecimal total;

    public Order(String number_id, Date ordered, Date shipped, Address ship_to, BigDecimal total) {
        this.number_id = number_id;
        this.ordered = ordered;
        this.shipped = shipped;
        this.ship_to = ship_to;
        this.total = total;
        BigDecimal precio = new BigDecimal(300);
        paymentList.add(new Payment("1 ", Date.from(Instant.now()), precio, "RTX3070"));
    }

    public String getNumber_id() {
        return number_id;
    }

    public void setNumber_id(String number_id) {
        this.number_id = number_id;
    }

    public Date getOrdered() {
        return ordered;
    }

    public void setOrdered(Date ordered) {
        this.ordered = ordered;
    }

    public Date getShipped() {
        return shipped;
    }

    public void setShipped(Date shipped) {
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
