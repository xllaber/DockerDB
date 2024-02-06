package com.despliegue.dokerdb.controller;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "datos")
@Entity
public class Datos {

    @Id
    private Long id;

    private String datos;

    public Datos(Long id, String datos) {
        this.id = id;
        this.datos = datos;
    }

    public Datos() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getDatos() {
        return datos;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }
}
