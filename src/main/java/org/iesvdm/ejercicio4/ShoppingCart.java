package org.iesvdm.ejercicio4;

import java.time.LocalDate;
import java.util.*;

public class ShoppingCart {
    private LocalDate created;

    private Account account;
    private WebUser webUser;

     private List<LineItem> lineItemSet= new ArrayList<>();



    public WebUser getWebUser() {
        return webUser;
    }

    public void setWebUser(WebUser webUser) {
        this.webUser = webUser;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public List<LineItem> getLineItemSet() {
        return lineItemSet;
    }

    public void setLineItemSet(List<LineItem> lineItemSet) {
        this.lineItemSet = lineItemSet;
    }

    public ShoppingCart(LocalDate created) {
        this.created = created;
    }

    public LocalDate getCreated() {
        return created;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }

}
