package org.iesvdm.ejercicio4;

import java.math.BigInteger;
import java.util.Date;

public class Payment {
    String id;
    Date paid;

    BigInteger total;

    String details;

    public Payment(String id, Date paid, BigInteger total, String details) {
        this.id = id;
        this.paid = paid;
        this.total = total;
        this.details = details;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getPaid() {
        return paid;
    }

    public void setPaid(Date paid) {
        this.paid = paid;
    }

    public BigInteger getTotal() {
        return total;
    }

    public void setTotal(BigInteger total) {
        this.total = total;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
