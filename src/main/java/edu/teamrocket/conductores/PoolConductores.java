package edu.teamrocket.conductores;

import java.util.ArrayList;
import java.util.List;

public class PoolConductores {
    List<Conductor> conductores = new ArrayList<>();

    public PoolConductores(List<Conductor> conductores) {
        this.conductores = conductores;
    }

    public List<Conductor> getPoolConductores() {
        return this.conductores;
    }

    public Conductor asignarConductor() {
        Conductor conductorDisponible = new Conductor();

        for (Conductor conductor : getPoolConductores()) {
            if (!conductor.isOcupado()) {
                conductor.setOcupado(true);
                conductorDisponible = conductor;
                break;
            }
        }

        return conductorDisponible;
    }
}
