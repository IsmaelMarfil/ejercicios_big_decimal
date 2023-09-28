package org.iesvdm.ejercicio4;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
    String number_id;
    Date ordered;
    Date shipped;
    Address ship_to;

    enum status {NEW, SHIPPED,HOLD, DELIVERED,CLOSED};
    BigDecimal total;

    public Order(String number_id, Date ordered, Date shipped, Address ship_to, BigDecimal total) {
        this.number_id = number_id;
        this.ordered = ordered;
        this.shipped = shipped;
        this.ship_to = ship_to;
        this.total = total;
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
