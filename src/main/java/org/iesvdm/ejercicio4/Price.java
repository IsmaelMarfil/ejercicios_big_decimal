package org.iesvdm.ejercicio4;

import java.math.BigDecimal;

public class Price {
    BigDecimal precioOriginal;
    BigDecimal precioOferta;

    public Price(BigDecimal precioOriginal, BigDecimal precioOferta) {
        this.precioOriginal = precioOriginal;
        this.precioOferta = precioOferta;
    }

    public BigDecimal getPrecioOriginal() {
        return precioOriginal;
    }

    public void setPrecioOriginal(BigDecimal precioOriginal) {
        this.precioOriginal = precioOriginal;
    }

    public BigDecimal getPrecioOferta() {
        return precioOferta;
    }

    public void setPrecioOferta(BigDecimal precioOferta) {
        this.precioOferta = precioOferta;
    }
}
