package org.iesvdm.ejercicio4;

public class Supplier {
    private String CIF;
    private String nombre;

    public Supplier(String CIF, String nombre) {
        this.CIF = CIF;
        this.nombre = nombre;
    }

    public String getCIF() {
        return CIF;
    }

    public void setCIF(String CIF) {
        this.CIF = CIF;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
