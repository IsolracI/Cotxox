package edu.teamrocket.carrera;

import edu.teamrocket.conductores.Conductor;
import edu.teamrocket.conductores.PoolConductores;
import edu.teamrocket.tarifa.Tarifa;

import java.util.List;

public class Carrera {
    private final String tarjetaCredito;
    private Conductor conductor;
    private String origen = "";
    private String destino = "";
    private double distancia = 0d;
    private int tiempoEsperado = 0;
    private int tiempoCarrera = 0;
    private double costeEsperado = 0d;
    private double costeTotal = 0d;
    private int propina = 0;

    public Carrera(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public String getTarjetaCredito() {
        return this.tarjetaCredito;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getOrigen() {
        return this.origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getDestino() {
        return this.destino;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getDistancia() {
        return this.distancia;
    }

    public void setTiempoEsperado(int tiempoEsperado) {
        this.tiempoEsperado = tiempoEsperado;
    }

    public int getTiempoEsperado() {
        return this.tiempoEsperado;
    }

    public double getCosteEsperado() {
        return Tarifa.getCosteTotalEsperado(this);
    }

    public void setTiempoCarrera(int tiempoCarrera) {
        this.tiempoCarrera = tiempoCarrera;
    }

    public int getTiempoCarrera() {
        return this.tiempoCarrera;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public Conductor getConductor() {
        return this.conductor;
    }

    public void asignarConductor(PoolConductores conductores) {
        Conductor conductorDisponible =conductores.asignarConductor();
        setConductor(conductorDisponible);
    }
}
