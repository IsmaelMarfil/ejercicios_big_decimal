package org.iesvdm.ejercicio4;

import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

public class ShoppingCart {
    private Date created;

    private Account account;

     private Set<LineItem> lineItemSet= new LinkedHashSet<>();

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Set<LineItem> getLineItemSet() {
        return lineItemSet;
    }

    public void setLineItemSet(Set<LineItem> lineItemSet) {
        this.lineItemSet = lineItemSet;
    }

    public ShoppingCart(Date created) {
        this.created = created;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

}
