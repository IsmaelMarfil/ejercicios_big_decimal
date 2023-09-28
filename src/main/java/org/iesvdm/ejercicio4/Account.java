package org.iesvdm.ejercicio4;

import java.util.Date;

public class Account {
    String id;
    Address billing_Address;
    boolean isClosed;
    Date open;

    Date closed;

    public Account(String id, Address billing_Address, boolean isClosed, Date open) {
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
}
