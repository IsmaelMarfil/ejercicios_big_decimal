package org.iesvdm.ejercicio4;

public class Phone {
    private String phoneCasa;
    private String phoneMovil;

    public Phone(String phoneCasa, String phoneMovil) {
        this.phoneCasa = phoneCasa;
        this.phoneMovil = phoneMovil;
    }

    public String getPhoneCasa() {
        return phoneCasa;
    }

    public void setPhoneCasa(String phoneCasa) {
        this.phoneCasa = phoneCasa;
    }

    public String getPhoneMovil() {
        return phoneMovil;
    }

    public void setPhoneMovil(String phoneMovil) {
        this.phoneMovil = phoneMovil;
    }
}
