package edu.teamrocket.tarifa;

import edu.teamrocket.carrera.Carrera;

import java.text.DecimalFormat;

public class Tarifa {
    static final double COSTE_MILLA = 1.35d;
    static final double COSTE_MINUTO = 0.35d;
    static final double COSTE_MINIMO = 5.00d;
    static byte POCENTAJE_COMISION = 20;

    public Tarifa() {}

    public static double getCosteDistancia(double distancia) {
        return distancia * COSTE_MILLA;
    }

    public static double getCosteTiempo(int tiempo) {
        return tiempo * COSTE_MINUTO;
    }

    public static double getCosteTotalEsperado(Carrera carrera) {
        double costeEsperado = getCosteTiempo(carrera.getTiempoEsperado()) + getCosteDistancia(carrera.getDistancia());

        if (costeEsperado < COSTE_MINIMO) {
            return COSTE_MINIMO;
        }
        else {
            return costeEsperado;
//            no entiendo muy bien el formateo de DecimalFormat xD
//            DecimalFormat numberFormat = new DecimalFormat("#,00");
//            return Double.parseDouble(numberFormat.format(costeEsperado));
        }
    }
}
