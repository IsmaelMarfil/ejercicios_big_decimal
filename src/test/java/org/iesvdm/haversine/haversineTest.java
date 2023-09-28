package org.iesvdm.haversine;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;


public class haversineTest {

    @Test
    public void test(){
        BigDecimal latitudGranada = new BigDecimal(37.176487);
        BigDecimal longitudGranada = new BigDecimal(-3.597929);
        posicion Granada = new posicion(latitudGranada, longitudGranada);
        BigDecimal latitudIgualada = new BigDecimal(41.57879);
        BigDecimal longitudIgualada = new BigDecimal(1.617221);
        posicion Igualada = new posicion(latitudIgualada, longitudIgualada);
        BigDecimal distancia = distanciaKM(Granada, Igualada);
    }
}
