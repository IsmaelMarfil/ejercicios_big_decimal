package org.iesvdm.ejercicio4;

public class WebUser {
    String login_id;
    String password;
    public enum state{BANNED, LOCKED, ACTIVE, NEW};

    public WebUser(String login_id, String password) {
        this.login_id = login_id;
        this.password = password;
    }
}
