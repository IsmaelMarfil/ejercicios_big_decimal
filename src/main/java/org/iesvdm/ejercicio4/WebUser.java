package org.iesvdm.ejercicio4;

public class WebUser {
    private String login_id;
    String password;
    private enum state{BANNED, LOCKED, ACTIVE, NEW};
    private Customer customer;
    private ShoppingCart shoppingCart;

    public WebUser(String login_id, String password) {
        this.login_id = login_id;
        this.password = password;
        this.customer = null;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getLogin_id() {
        return login_id;
    }

    public void setLogin_id(String login_id) {
        this.login_id = login_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
