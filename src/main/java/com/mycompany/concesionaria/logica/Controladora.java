package com.mycompany.concesionaria.logica;

import com.mycompany.concesionaria.persistencia.ControladoraPersistencia;
import java.util.List;

/**
 *
 * @author Javi
 */
public class Controladora {

    ControladoraPersistencia controladoraPersistencia = new ControladoraPersistencia();

    // CRUD Automovil
    public void createAutomovil(Automovil automovil) {
        controladoraPersistencia.createAutomovil(automovil);
    }

    public void destroyAutomovil(int id) {
        controladoraPersistencia.destroyAutomovil(id);
    }

    public void editAutomovil(Automovil automovil) {
        controladoraPersistencia.editAutomovil(automovil);
    }

    public Automovil findAutomovil(int id) {
        return controladoraPersistencia.findAutomovil(id);
    }

    public List<Automovil> findAllAutomovil() {
        return controladoraPersistencia.findAllAutomovil();
    }

    public Automovil findAutoByPlate(String plate) {
        return controladoraPersistencia.findAutoByPlate(plate);
    }

    public void destroyAutomovilByPlate(String plate) {

        controladoraPersistencia.destroyAutomovilByPlate(plate);
    }
}
