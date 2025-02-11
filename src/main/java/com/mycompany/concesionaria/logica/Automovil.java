package com.mycompany.concesionaria.logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.UniqueConstraint;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author Javi
 */

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Automovil implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Basic
    private String brand;
    private String model;
    private String color;
    @Column(unique = true)
    private String plate;

    public Automovil(String brand, String model, String color, String plate) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.plate = plate;
    }
}
