package com.mycompany.concesionaria.persistencia;

import com.mycompany.concesionaria.logica.Automovil;
import com.mycompany.concesionaria.persistencia.exceptions.NonexistentEntityException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Javi
 */
public class ControladoraPersistencia {

    AutomovilJpaController automovilJPA = new AutomovilJpaController();

    // Automovil
    public void createAutomovil(Automovil automovil) {
        try {
            automovilJPA.create(automovil);
        } catch (SQLIntegrityConstraintViolationException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void destroyAutomovil(int id) {
        try {
            automovilJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editAutomovil(Automovil automovil) {
        try {
            automovilJPA.edit(automovil);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Automovil findAutomovil(int id) {
        return automovilJPA.findAutomovil(id);
    }

    public List<Automovil> findAllAutomovil() {
        return automovilJPA.findAutomovilEntities();
    }

    public Automovil findAutoByPlate(String plate) {
        return automovilJPA.findByPlate(plate);
    }

    public void destroyAutomovilByPlate(String plate) {
        try {
            automovilJPA.destroyByPlate(plate);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
