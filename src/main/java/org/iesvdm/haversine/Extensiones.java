package org.iesvdm.haversine;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Extensiones {
    public  BigDecimal radioTierraKM= new BigDecimal(6378.0);
    public  BigDecimal distanciaKM  (posicion posicionOrigen, posicion posicionDestino){
        BigDecimal difLatitud = (posicionOrigen.getLatitud().subtract(posicionDestino.getLatitud()));
        BigDecimal difLongitud = (posicionOrigen.getLongitud().subtract(posicionDestino.getLongitud()));
        BigDecimal difLatitudRad = enRadianes(difLatitud);
        BigDecimal difLongitudRad = enRadianes(difLongitud);
        BigDecimal dos = new BigDecimal(2);
        var primeraLinea = BigDecimal.valueOf(Math.sin(difLatitudRad.divide(BigDecimal.TWO, 12, RoundingMode.HALF_UP).pow(2).doubleValue()));
        var segundaLinea = BigDecimal.valueOf(Math.cos(enRadianes(posicionOrigen.getLatitud()).doubleValue()));
        var terceraLinea = BigDecimal.valueOf(Math.cos(enRadianes(posicionDestino.getLatitud()).doubleValue()));
        var cuartaLinea = BigDecimal.valueOf(Math.sin(difLongitudRad.divide(BigDecimal.TWO, 12, RoundingMode.HALF_UP).pow(2).doubleValue()));

        var a = primeraLinea.add(segundaLinea.multiply(terceraLinea.multiply(cuartaLinea)));
        BigDecimal unomenosa = BigDecimal.ONE.subtract(a);
        double raiz = unomenosa.sqrt(MathContext.DECIMAL128).doubleValue();
        BigDecimal c = BigDecimal.valueOf(2).multiply(BigDecimal.valueOf(Math.atan2(a.sqrt(MathContext.DECIMAL128).doubleValue(), raiz)));
        BigDecimal distancia = radioTierraKM.multiply(c);
        return c;
    }
    public static BigDecimal enRadianes(BigDecimal valor){
        BigDecimal piBD = new BigDecimal(Math.PI);
        BigDecimal cientochenta = new BigDecimal(180);
        BigDecimal valorRadianes = (valor.multiply(piBD)).divide(cientochenta, RoundingMode.DOWN);

        return  valorRadianes;

    }
}
